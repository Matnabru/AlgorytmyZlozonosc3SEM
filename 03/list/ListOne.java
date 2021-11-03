package list;

public class ListOne<T> implements IList{
    private ElemOne<T> bottomElement;
    private ElemOne<T> topElement;

    private int numberOfElements =0;
    @Override
    public void addFirst(Object newData) {
        ElemOne<T> newElement = new ElemOne<T>((T) newData);
        newElement.setNext(bottomElement);
        bottomElement = newElement;

        if(bottomElement.getNext()==null){
            topElement = bottomElement;
        }
        numberOfElements++;
    }

    @Override
    public void addLast(Object newData) {
        ElemOne<T> newElement = new ElemOne<T>((T) newData);
        topElement.setNext(newElement);
        topElement = newElement;
        numberOfElements++;
    }

    @Override
    public void addAtPosition(Object newData, int position) throws ListException {

        if(position < 0 || position > numberOfElements){
            try {
                throw new ListException("Bad position");
            }catch (ListException e){
                System.out.println(e.toString());
            }
        }
        if(position == 0 ){
            addFirst(newData);
            return;
        }
        else if(position == numberOfElements -1 ){
            addLast(newData);
            return;
        }else {

            int length = 0;
            ElemOne<T> iteratingElement;
            iteratingElement = bottomElement;
            while (iteratingElement!= null){
                iteratingElement = iteratingElement.getNext();
                if(length == position-1){
                    ElemOne<T> newElement = new ElemOne<T>((T) newData);
                    newElement.setNext(iteratingElement.getNext());
                    iteratingElement.setNext(newElement);
                    numberOfElements++;
                    return;
                }
                length++;
            }
        }
    }

    @Override
    public int size() {
        int length = 0;
        ElemOne<T> iteratingElement;
        iteratingElement = bottomElement;
        while (iteratingElement!= null){
            iteratingElement = iteratingElement.getNext();
            length++;
        }
        return length;
    }

    @Override
    public Object get(int position) throws ListException {
        int length = 0;
        ElemOne<T> iteratingElement;
        iteratingElement = bottomElement;
        while (iteratingElement!= null){
            iteratingElement = iteratingElement.getNext();

            if(length == position){
                return iteratingElement.getData();
            }
            length++;
        }
        return null;
    }

    @Override
    public Object removeFirst() throws ListException {
            try {
                if(bottomElement == null){
                    throw new ListException("List is already empty!");
                }
            }catch (ListException e ){
                System.out.println(e.toString());
            }
        bottomElement = bottomElement.getNext();
        numberOfElements--;
        return bottomElement.getData();
    }

    @Override
    public Object removeLast() throws ListException {
        try {
            if(bottomElement == null){
                throw new ListException("List is already empty!");
            }
        }catch (ListException e ){
            System.out.println(e.toString());
        }

        int length = 1;
        ElemOne<T> removedElement;
        ElemOne<T> iteratingElement;
        iteratingElement = bottomElement;
        while (length!= numberOfElements -1){
            iteratingElement = iteratingElement.getNext();
            length++;
        }
        removedElement = iteratingElement.getNext();
        iteratingElement.setNext(null);
        numberOfElements--;
        return removedElement.getData();
    }

    @Override
    public Object remove(int position) throws ListException {

        if(position < 0 || position > numberOfElements){
            try {
                throw new ListException("Bad position");
            }catch (ListException e){
                System.out.println(e.toString());
            }
        }
        if(position == 0 ){
            return removeFirst();
        }
        else if(position == numberOfElements -1 ){
            return removeLast();
        }else {

            int length = 0;
            ElemOne<T> iteratingElement;
            iteratingElement = bottomElement;
            while (iteratingElement!= null){
                iteratingElement = iteratingElement.getNext();
                if(length == position-1){
                    ElemOne<T> newElement = iteratingElement.getNext();
                    iteratingElement.setNext(newElement.getNext());
                    numberOfElements--;
                    return newElement.getData();
                }
                length++;
            }
        }
        return null;
    }

    @Override
    public int find(Object dataToFind) {
        int length = 0;
        ElemOne<T> iteratingElement;
        iteratingElement = bottomElement;
        while (iteratingElement!= null){
            if(dataToFind == iteratingElement.getData()){
                return length;
            }

            iteratingElement = iteratingElement.getNext();
            length++;
        }
        return -1;

    }

    @Override
    public boolean contains(Object data) {
        ElemOne<T> iteratingElement;
        iteratingElement = bottomElement;
        while (iteratingElement!= null){
            if(iteratingElement.getData() == data)
                return true;
            iteratingElement = iteratingElement.getNext();

        }
        return false;
    }

    @Override
    public void print() {
        ElemOne<T> iteratingElement;
        iteratingElement = bottomElement;
        while (iteratingElement!= null){
            System.out.println(iteratingElement.getData() + " ");
            iteratingElement = iteratingElement.getNext();
        }
    }

    @Override
    public IList join(IList druga) {
        return null;
    }

    @Override
    public boolean similar(IList list) {
        return false;
    }
}
