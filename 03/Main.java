import list.ListDouble;
import list.ListException;
import list.ListOne;

public class Main {

    public static void main(String[] args) throws ListException {
	// write your code here
        //listOne();
        //listDouble();
        combineLists();
    }
    static void listOne() throws ListException {
        ListOne<Double> list = new ListOne<>();
        list.print();
        list.addFirst(1.22);
        list.addLast(10.11);
        list.addFirst(1.23);
        list.addLast(99.99);
        list.print();

        System.out.println("Il. elementow : " + list.size());


        list.addAtPosition(100.00,1);

        list.print();

        System.out.println("Removed first");
        list.removeFirst();
        list.print();

        System.out.println("Removed last");
        list.removeLast();
        list.print();

        System.out.println("Removed from position");
        list.remove(1);
        list.print();
    }
    static void listDouble() throws ListException {
        ListDouble<Double> list = new ListDouble<>();
        list.addFirst(2.22);
        list.addFirst(4.44);
        list.addLast(6.66);
        list.addLast(10.10);
        list.print();

        System.out.println("Size : " + list.size());

        list.addAtPosition(1.00,2);
        list.print();

        list.removeFirst();
        list.removeLast();
        System.out.println("Removed first and last element");
        list.print();


        System.out.println("New list");
        list.addAtPosition(1.23,2);
        list.print();
        System.out.println("Removing");
        list.remove(2);
        list.print();

    }
    static void combineLists(){
        System.out.println("Combined list : ");
        ListDouble<Integer> listX = new ListDouble<>();
        listX.addLast(1);
        listX.addLast(2);
        listX.addLast(2);

        ListDouble<Integer> listY = new ListDouble<>();
        listY.addLast(3);
        listY.addLast(2);
        listY.addLast(1);

        ListDouble<Integer> listZ = (ListDouble<Integer>) listX.join(listY);
        //listZ.print();


        System.out.println(listX.similar(listY));
        listY.print();
    }
}
