package com.green.day16.ch7;

public class PolyTest3 {
    public static void main(String[] args) {
        BullDog bullDog = new BullDog();
        Dog dog = new Dog();
        Animal ani = new BullDog();
        boolean r = bullDog instanceof Dog;
        System.out.println("r: " + r);
        System.out.println(ani instanceof Dog);//false
        ani = new BullDog();
        System.out.println(ani instanceof Dog);//true
        String str = "!2345";
        System.out.println(str instanceof String);
    }
}
