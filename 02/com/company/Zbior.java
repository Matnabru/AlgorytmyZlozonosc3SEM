package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Zbior implements IZbior{

    private HashSet<Integer> hashMap = new HashSet<Integer>();

    @Override
    public int size() {
        return hashMap.size();
    }

    @Override
    public boolean add(int element) {
        try{
            hashMap.add(element);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public boolean remove(int element) {
        try{
            hashMap.remove(element);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public boolean contains(int element) {
        try{
            return hashMap.contains(element);
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean equals(Zbior zbior) {
        return hashMap.equals(zbior.getHashMap());
    }

    @Override
    public boolean loadFromFile(String filename) {
        File file = new File(filename);
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        while(scanner.hasNextInt())
        {
            add(scanner.nextInt());
        }
        return true;
    }

    @Override
    public Zbior merge(Zbior zbior) {
        Zbior finalObject = new Zbior();
        // Adds hashmap from this object
        finalObject.addHashMap(getHashMap());

        // Add hashmap from 'zbior' object
        finalObject.addHashMap(zbior.getHashMap());
        return finalObject;
    }

    @Override
    public Zbior about(Zbior zbior) {
        Zbior aboutHashMap = new Zbior();

        for(int temp : hashMap){
            if(zbior.contains(temp)){
                aboutHashMap.add(temp);
            }
        }
        for(int temp : zbior.getHashMap()){
            if(contains(temp)){
                aboutHashMap.add(temp);
            }
        }

        return aboutHashMap;
    }

    @Override
    public Zbior diffrence(Zbior zbior) {
        Zbior diffrence = this;
        // Get every number which is in both maps
        Zbior about = about(zbior);
        // Remove numbers that are in both maps from one map
        for(int temp : about.getHashMap()){
            diffrence.remove(temp);
        }
        return diffrence;
    }

    @Override
    public Zbior symmetricDiffrence(Zbior zbior) {
        Zbior sum = merge(zbior);
        Zbior A = about(zbior);
        for( int temp : A.getHashMap()){
            sum.remove(temp);
        }
        return sum;
    }

    public HashSet<Integer> getHashMap() {
        return hashMap;
    }

    public boolean addHashMap(HashSet <Integer> set){
        try {
            hashMap.addAll(set);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String value = "";
        // creates Iterator oblect.
        Iterator itr = hashMap.iterator();

        // check element is present or not. if not loop will
        // break.
        while (itr.hasNext()) {
            value += itr.next() + " ";
        }
        return value;
    }
}
