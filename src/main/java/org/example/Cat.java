package org.example;

public class Cat extends Animal {

    static int catCount;

    public Cat(String type, String name) {
        super(type, name, 200, 0);
        catCount++;
    }

    public Cat() {
    }

//    public Cat(String type, String name) {
//        super(type, name);
//    }

    @Override
    public void voice() {
      System.out.println("мяу !");

//
//    public Cat(String type, String name, int age) {
//        super(type, name, age);
//    }
//

    }}
//
//
//    @Override
//    public void animalInfo() {
//        System.out.println("Вид животного: "+type+"; Имя: " +name+ "; Возраст: "+age);
//    }
//

//    }
//
//    @Override
//    public void jump() {
//        System.out.println("Прыжок кота");
//    }
//
//    public void klubok(){
//        System.out.println("Кот свернулся в колубок!");
//    }
//}
