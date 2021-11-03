package com.company;


public interface IZbior {
    int size();
    boolean add(int element);
    boolean remove(int element);
    boolean contains(int element);
    boolean equals(Zbior zbior);
    boolean loadFromFile(String filename);
    Zbior merge(Zbior zbior);
    Zbior about(Zbior zbior);
    Zbior diffrence(Zbior zbior);
    Zbior symmetricDiffrence(Zbior zbior);
}
