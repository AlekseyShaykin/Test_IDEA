package org.example;

public class Animal {
    protected String type;
    protected String name;
//    protected int age;

    protected int maxRunDistance;

    protected int maxSwimDistance;

    static int count;

    public Animal(String type, String name, int maxRunDistance, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        count++;
    }

    public Animal() {
    }

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(type + " " + name + " может пробежать " + distance + " метров");
        } else {
            System.out.println(type + " " + name + " НЕ может пробежать " + distance + " метров");
        }
    }

    public void swim(int distance) {
        if (maxSwimDistance == 0) {
            System.out.println(type + " " + name + " " + "не умеет плавать");
        } if (maxSwimDistance>distance) {
            System.out.println(type + " " + name + " " + "может проплыть " + distance + " метров");
        }else{
            System.out.println(type + " " + name + " " + "НЕ может проплыть " + distance + " метров");

        }

    }

    public void voice() {
        System.out.println();
    }
}


//    public Animal(String type, String name, int age) {
//        this.type = type;
//        this.name = name;
//        this.age = age;
//    }
//

//
//
//    public void animalInfo() {
//        System.out.println(this.type);
//    }
//
////   abstract void voice();
//

//
//    public void jump(){
//        System.out.println();
//    }


