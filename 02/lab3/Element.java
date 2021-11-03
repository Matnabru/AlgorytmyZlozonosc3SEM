package lab3;

public class Element{ // element stosu
    public int dane; // wyjątkowo, dla uproszczenia, pola publiczne
    public Element next; // referencja do następnego elementu stosu
    public Element(int _dane){
        dane = _dane;
    }

    public void setNext(Element _next){
        next = _next;
    }
}
