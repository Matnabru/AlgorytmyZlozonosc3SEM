package lab3;

public class ElementGeneryczny<T>{
    public T dane;
    public ElementGeneryczny<T> next;

    public ElementGeneryczny(T _dane){
        dane = _dane;
    }

    public void setNext(ElementGeneryczny<T> _next){
        next = _next;
    }
}
