package org.example;

public class DomCat extends Animal {

    static int DomCatCount;
    public DomCat(String type, String name, int maxRunDistance, int maxSwimDistance) {
        super(type, name, maxRunDistance, maxSwimDistance);
        DomCatCount++;
    }
}
