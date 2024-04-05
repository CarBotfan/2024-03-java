package com.green.day17.ch7;

public class AnnonymousTest {
    public static void main(String[] args) {
        Object obj = new Car();
        Object obj2 = new Object() {
            void drive() {
                System.out.println("brrrrr");
            }
            @Override
            public String toString() {
                return "익명 클래스";
            }
        };
        System.out.println(obj);
        System.out.println(obj2);
    }
}
class Car {
    void drive() {
        System.out.println("Brrrrrr");
    }
}