package lab3;

public class StosGeneryczny<T> implements IStosGeneryczny<T>{
    private ElementGeneryczny<T> top;

    @Override
    public void push(T i) {
        ElementGeneryczny<T> ostatni = new ElementGeneryczny<T>(i);
        ostatni.setNext(top);
        top = ostatni;
    }

    @Override
    public T pop() throws StosPustyException {
        if(top != null){
            T ostatniaLiczba = top.dane;
            top = top.next;
            return ostatniaLiczba;
        }else throw new StosPustyException("Stos jest juz pusty!");
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void print() {
        ElementGeneryczny<T> wypisywany = top;
        StringBuffer buffer = new StringBuffer("");
        if(top == null){
            return;
        }
        while(true){
            buffer.append(wypisywany.dane + " ");
            //System.out.print(wypisywany.dane + " ");
            if(wypisywany.next != null)
                wypisywany = wypisywany.next;
            else{
                System.out.println(buffer);
                break;
            }
        }
    }

    @Override
    public void clear() {

    }
}

