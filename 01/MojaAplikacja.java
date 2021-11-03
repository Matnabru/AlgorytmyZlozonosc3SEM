import java.time.chrono.Era;
import java.util.Scanner;

public class MojaAplikacja {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        //Z1();
        //Z2();
        //Z3();
        //Z4();
        //Z5();
        //Z6();
        //Z7();
        //Z8();
        //Z9();
    }
    private static void Z1(){

        // Ex 1
        System.out.print("Zad 1 : ");

        int seconds;
        seconds = scanner.nextInt();
        Z1 z1 = new Z1();
        z1.wypiszGodzinyIMinuty(seconds);
    }
    private static void Z2(){
        // Ex 2
        System.out.println("\nZad 2 : ");

        int firstNum, secondNum;
        firstNum = scanner.nextInt();
        secondNum = scanner.nextInt();

        NWD nwd = new NWD();
        System.out.println(nwd.NWD_1(firstNum,secondNum));
    }
    private static void Z3(){
        System.out.println("\nZad 3 : ");
        // Ex 3
        int num;
        num = scanner.nextInt();
        PrimeNumbers primeNumbers = new PrimeNumbers();
        System.out.println(primeNumbers.checkIfPrime(num));
    }
    private static void Z4(){
        System.out.println("\nZad 4 : ");
        // Ex 4
        String number;
        number = scanner.next();

        From2To10 from2To10 = new From2To10();
        System.out.println(from2To10.convert(number));
    }
    private static void Z5(){
        // Ex 5
        System.out.println("\nZad 5 : ");
        int num;
        num = scanner.nextInt();
        EratosthenesSieve eratosthenesSieve = new EratosthenesSieve();
        eratosthenesSieve.sieveOfEratosthenes(num);
    }
    private static void Z6(){
        // Ex 6
        String stringNum;
        stringNum = scanner.next();
        System.out.println("\nZad 6 : ");
        NumSum numSum = new NumSum();
        System.out.println(numSum.sumFromWholeNumber(stringNum));
    }
    private static void Z7(){

        // Ex 7
        System.out.println("\nZad 7 : ");


        int num;
        num = scanner.nextInt();
        Fibo fibo = new Fibo();
        System.out.println(fibo.fib(num));
    }
    private static void Z8(){
        // Ex 8
        System.out.println("\nZad 8 : ");


        int num;
        num = scanner.nextInt();
        Silnia silnia = new Silnia();
        System.out.println(silnia.silnia(num));
    }
    private static void Z9(){
        // Ex 9
        System.out.println("\nZad 9 : ");
        int n, k;
        n = scanner.nextInt();
        k = scanner.nextInt();
        NewtonSymbol newtonSymbol = new NewtonSymbol();
        System.out.println(newtonSymbol.calculate(3,2));
    }
}
