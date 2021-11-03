package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Zbior zbior = new Zbior();

        // Load from file
        Zbior loadedZbior = new Zbior();
        loadedZbior.loadFromFile("src/numbers.txt");
        System.out.println(loadedZbior.toString());


        // 2. Add
        zbior.add(1);
        zbior.add(12);
        zbior.add(8);

        // 3. Print
        System.out.println(zbior.toString());

        // 1. Contains
        System.out.println(zbior.contains(1));
        System.out.println(zbior.contains(13));

        // 5. Delete
        zbior.remove(8);
        System.out.println(zbior.toString());

        // 6. Is equal
        // zbior: 1,12   zbior1: 1,12
        Zbior zbior1 = new Zbior();
        zbior1.add(1);
        zbior1.add(12);
        System.out.println(zbior.toString());
        System.out.println(zbior.equals(zbior1));

        // 7. Operations

        // Sum (suma)
        zbior1.add(22);
        zbior.add(15);
        System.out.println("Sum");
        System.out.println(zbior.toString());
        System.out.println(zbior1.toString());
        // zbior: 1,12,15    zbior1: 1,12,22
        Zbior zbior2 = zbior.merge(zbior1);
        System.out.println(zbior2.toString());

        // About (czesc wspolna)
        System.out.println("About");
        System.out.println(zbior.toString());
        System.out.println(zbior1.toString());

        Zbior about = zbior.about(zbior1);
        System.out.println(about.toString());

        // Diffrence
        System.out.println("Diffrence");
        System.out.println(zbior.toString());
        System.out.println(zbior1.toString());

        Zbior diffrence = zbior.diffrence(zbior1);
        System.out.println(diffrence.toString());

        // Symmetric Diffrence
        zbior.add(1);
        zbior.add(123);
        System.out.println("Symetric Diffrence");
        System.out.println(zbior.toString());
        System.out.println(zbior1.toString());

        Zbior symmetricdiffrence = zbior.symmetricDiffrence(zbior1);
        System.out.println(symmetricdiffrence.toString());
    }
}
