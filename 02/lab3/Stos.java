package lab3;

public class Stos implements IStos{
    Element top;

    @Override
    public void push(int i) {
    Element ostatni = new Element(i);
    ostatni.setNext(top);
    top = ostatni;
    }

    @Override
    public int pop() throws StosPustyException {
        if(top != null){
            int ostatniaLiczba = top.dane;
            top = top.next;
            return ostatniaLiczba;
        }else throw new StosPustyException("Stos jest juz pusty!");
    }

    @Override
    public int peek() {
        return top.dane;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public void print() {
        Element wypisywany = top;
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
        top = null;
    }

    @Override
    public String toString() {
        String s = "";
        if(top == null){
            return s;
        }
        Element wypisywany = top;
        while(true){
            s+= wypisywany.dane;
            if(wypisywany.next != null)
                wypisywany = wypisywany.next;
            else{
                return s;
            }
        }
    }
}
