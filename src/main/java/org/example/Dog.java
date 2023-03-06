package org.example;

public class Dog extends Animal{

    static int DogCount;

    public Dog(String type, String name) {
        super(type, name, 500, 10);
        DogCount++;
    }

    public Dog() {
    }
}
