package com.green.day16.ch7;

public class PolyTest2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        BullDog bulldog = new BullDog();
        Cat cat = new Cat();
        doCrying(dog);
        doCrying(bulldog);
        doCrying(cat);
    }

    public static void doCrying(Animal animal) {
        animal.crying();
//        if(animal instanceof Dog) {
//            ((Dog) animal).sleep();
//        }
        if(animal instanceof Dog dog) { //enhanced instanceof
            dog.sleep();
        }
    }

}
