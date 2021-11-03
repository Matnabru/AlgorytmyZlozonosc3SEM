package lab3;

public interface IStosGeneryczny<T> {
    public void push(T i); // dodaje i na stos
    public T pop() throws StosPustyException; // zdejmuje element, zwraca wartość z wierzchołka
    public T peek(); // zwraca wartość z wierzchołka stosu
    public boolean isEmpty(); // sprawdza, czy stos jest pusty
    public void print(); // wypisuje na ekran zawartość stosu
    public void clear(); // usuwa wszystkie elementy ze stosu
}
