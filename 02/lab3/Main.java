package lab3;

public class Main {
    public static void main(String[] args) throws StosPustyException {
        //definicjaStosu();
        //sprawdzacz();
        //palindrom();
        //nONP();
        stosGeneryczny();
    }
    static void definicjaStosu() throws StosPustyException {
        Stos stos = new Stos();
        // 4. isEmpty
        System.out.println( "Pusty stos: " + stos.isEmpty());
        stos.push(1);
        stos.pop();
        // Stos pusty exception
        //stos.pop();
        System.out.println( "Pusty stos: " + stos.isEmpty());
        // 1. push
        stos.push(1);
        stos.push(6);
        stos.push(61);
        // 5. print
        System.out.println("Caly stos");
        stos.print();
        // 2. pop
        System.out.println("Stos.pop");
        stos.pop();
        stos.print();

        // 3. peek
        System.out.println("Stos.peek\n" + stos.peek());

        // 6. clear
        System.out.println("Stos.clear");
        stos.clear();
        stos.print();
    }
    static void sprawdzacz(){
        SprawdzaczNawiasow sprawdzaczNawiasow = new SprawdzaczNawiasow();
        System.out.println(sprawdzaczNawiasow.sprawdzNawiasy("()"));
        System.out.println(sprawdzaczNawiasow.sprawdzNawiasy("(()))"));
    }
    static void palindrom(){
        Palindrom palindrom = new Palindrom();
        System.out.println(palindrom.czyPalindrom("Ala"));
    }
    static void nONP() throws StosPustyException {
        notacjaONP onp = new notacjaONP();
        //System.out.println(onp.Oblicz("352*+"));
        //System.out.println(onp.Oblicz("42*63/+"));
        //System.out.println(onp.Oblicz("942*-"));
        System.out.println(onp.Oblicz("52+7*"));
    }
    static void stosGeneryczny() throws StosPustyException{
        StosGeneryczny<Double> stosGeneryczny = new StosGeneryczny<>();
        stosGeneryczny.push(1.34);
        stosGeneryczny.push(33.99);
        stosGeneryczny.print();
        stosGeneryczny.pop();
        stosGeneryczny.print();

    }
}
