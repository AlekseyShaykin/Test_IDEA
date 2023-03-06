package org.example;

public class Main {
    public static void main(String[] args) {

//        Animal kitty = new Cat();
//
//        kitty.name = "Tom";
//        kitty.type = "CAT";


//        kitty.run(210);

//        Dog dogggy = new Dog("Собака", "Бобиккк");
//        dogggy.swim(499);

        Animal[] animals = {new Cat("Кошка", "Моня"), new Cat("Кошка", "Саня"),new Dog("Собака ","Рэсси "),new Tiger("Тигр ","Шерхан ",1500,50)
        };
        for(Animal item:animals){
            item.run(250);
            item.swim(150);

        }
        System.out.println("Итого животных = "+ Animal.count);





//        Animal[] catAndDog = {
//                new Cat("CAT", "Tommy"),
//                new Tiger("Tiger", "Sherkhan")
//        };


//        for (Animal item : catAndDog) {
//            item.voice();
//        }


//        kitty.age = 2;
//
//        kitty.animalInfo();
//        kitty.voice();
//        kitty.jump();
//        kitty.klubok();


    }
}