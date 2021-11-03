package list;

public class ElemDouble<T> {
    private T data;
    private ElemDouble<T> next;
    private ElemDouble<T> previous;

    public ElemDouble(T data) {
        this.data = data;
    }

    public ElemDouble(T data, ElemDouble<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ElemDouble<T> getNext() {
        return next;
    }

    public void setNext(ElemDouble<T> next) {
        this.next = next;
    }

    public void setPrevious(ElemDouble<T> previous) {
        this.previous = previous;
    }
    public ElemDouble<T> getPrevious() {
        return previous;
    }
}
