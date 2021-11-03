package lab3;

public interface IStos {
    public void push(int i); // dodaje i na stos
    public int pop() throws StosPustyException; // zdejmuje element, zwraca wartość z wierzchołka
    public int peek(); // zwraca wartość z wierzchołka stosu
    public boolean isEmpty(); // sprawdza, czy stos jest pusty
    public void print(); // wypisuje na ekran zawartość stosu
    public void clear(); // usuwa wszystkie elementy ze stosu
}
