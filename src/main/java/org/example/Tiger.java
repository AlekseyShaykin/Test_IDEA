package org.example;

public class Tiger extends Animal {

    static int TigerCount;
    public Tiger(String type, String name) {
        super(type, name);
    }

    public Tiger(String type, String name, int maxRunDistance, int maxSwimDistance) {
        super(type, name, maxRunDistance, maxSwimDistance);
        TigerCount++;
    }

    @Override
    public void voice() {
        System.out.println("РРРРРР.....");
    }
}
