package list;

public class ListDouble<T> implements IList<T>{
    private ElemDouble<T> first;
    private ElemDouble<T> last;
    private int numberOfElements=0;
    @Override
    public void addFirst(T newData) {
        ElemDouble<T> elem = new ElemDouble<T>((T) newData);
        if(first == null){
            first = elem;
            last = elem;
        }else{
            elem.setNext(first);
            first.setPrevious(elem);
            first = elem;
        }
        numberOfElements++;
    }

    @Override
    public void addLast(T newData) {
        ElemDouble<T> elem = new ElemDouble<T>((T) newData);
        if(last == null){
            first = elem;
            last = elem;
        }else{
            last.setNext(elem);
            elem.setPrevious(last);
            last = elem;
        }
        numberOfElements++;
    }

    @Override
    public void addAtPosition(T newData, int position) throws ListException {

        if(position < 0 || position > numberOfElements){
            try {
                throw new ListException("Bad position");
            }catch (ListException e){
                System.out.println(e.toString());
            }
        }

        if(position == 0){
            addFirst(newData);
            return;
        }else if(position == numberOfElements -1){
            addLast(newData);
            return;
        }
        int iterator = 0;
        ElemDouble<T> iteratingElem = first;
        while(iteratingElem!= null){
            if(position -1 == iterator){
                ElemDouble<T> betweenElement = new ElemDouble<T>((T) newData);
                ElemDouble<T> afterElement = iteratingElem.getNext();

                betweenElement.setNext(afterElement);
                betweenElement.setPrevious(iteratingElem);
                iteratingElem.setNext(betweenElement);
                afterElement.setPrevious(betweenElement);

                numberOfElements++;
                return;
            }

            iteratingElem = iteratingElem.getNext();
            iterator++;
        }
    }

    @Override
    public int size() {
        return numberOfElements;
    }

    @Override
    public T get(int position) throws ListException {
        int iterator = 0;
        ElemDouble<T> iteratingElem = first;
        while(iteratingElem!= null){
            if(position == iterator){
                return iteratingElem.getData();
            }

            iteratingElem = iteratingElem.getNext();
            iterator++;
        }
        return null;
    }

    @Override
    public T removeFirst() throws ListException {
        ElemDouble<T> returnedElement = first;
        try {
            if(returnedElement == null){
                throw  new ListException("Removing element from empty List");
            }
        }catch (ListException e){
            e.printStackTrace();
        }

        first = first.getNext();
        numberOfElements--;
        // Check if there is only 1 element
        if(first == null){
            return returnedElement.getData();
        }
        first.setPrevious(null);
        return returnedElement.getData();
    }

    @Override
    public T removeLast() throws ListException {
        ElemDouble<T> returnedElement = last;
        last = last.getPrevious();
        last.setNext(null);
        numberOfElements--;
        return returnedElement.getData();

    }

    @Override
    public T remove(int position) throws ListException {
        if(position < 0 || position > numberOfElements){
            try {
                throw new ListException("Bad position");
            }catch (ListException e){
                System.out.println(e.toString());
            }
        }

        if(position == 0){
            return removeFirst();
        }else if(position == numberOfElements -1){
            return removeLast();
        }
        int iterator = 0;
        ElemDouble<T> iteratingElem = first;
        while(iteratingElem!= null){
            if(position == iterator){
                ElemDouble<T> beforeElement = iteratingElem.getPrevious();
                ElemDouble<T> afterElement = iteratingElem.getNext();
                if(beforeElement != null)
                    beforeElement.setNext(afterElement);
                if(afterElement != null)
                    afterElement.setPrevious(beforeElement);
                numberOfElements--;
                return iteratingElem.getData();
            }

            iteratingElem = iteratingElem.getNext();
            iterator++;
        }
        return null;
    }

    @Override
    public int find(T dataToFind) {
        int iterator = 0;
        ElemDouble<T> iteratingElem = first;
        while(iteratingElem!= null){
            if(dataToFind == iteratingElem.getData()){
                return iterator;
            }

            iteratingElem = iteratingElem.getNext();
            iterator++;
        }
        return -1;
    }

    @Override
    public boolean contains(T data) {
        ElemDouble<T> iteratingElem = first;
        while(iteratingElem!= null){
            if(data == iteratingElem.getData()){
                return true;
            }
            iteratingElem = iteratingElem.getNext();
        }
        return false;
    }

    @Override
    public void print() {
        ElemDouble<T> iteratingElem;
        iteratingElem = first;
        while(iteratingElem!= null){
            System.out.println(iteratingElem.getData() + " ");
            iteratingElem = iteratingElem.getNext();
        }
    }

    @Override
    public IList<T> join(IList<T> druga) {
        ListDouble<T> list = new ListDouble<>();

        ElemDouble<T> element = first;
        for(int i=0;i<size();i++){
            list.addLast(element.getData());
            element = element.getNext();
        }
        for(int i=0;i< druga.size();i++){
            try {
                list.addLast(druga.get(i));
            }catch (ListException e){

            }
        }
        return list;
    }

    @Override
    public boolean similar(IList<T> list) {
        ListDouble<T> listDouble = new ListDouble<>();
        for(int i=0;i<list.size();i++){
            try {
                listDouble.addLast(list.get(i));
            }catch (ListException e){

            }
        }
        //listDouble.print();

        // If size is diffrent return false
        if(size() != list.size())
            return false;

        int position;
        T data;
        for(int i=0;i<numberOfElements;i++){
            // For every element in (this) T
            // Find and remove T (element) with the same value from other list
            try {
                data = get(i);
                position = listDouble.find(data);
                //System.out.println( "P "+ position);
                if(position == -1){
                    // If element not found
                    return false;
                }else {
                    listDouble.remove(position);
                    //System.out.println("List:");
                    //list.print();
                    //System.out.println(list.size() + "SIZE");
                }
            }catch (ListException e) {
                System.out.println(e.toString());
            }
        }
        if (list.size() == 0){
            return true;
        }

        return false;
    }
}
