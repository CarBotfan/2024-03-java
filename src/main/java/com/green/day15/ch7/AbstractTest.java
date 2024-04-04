package com.green.day15.ch7;

public class AbstractTest {
    public static void main(String[] args) {
        //Dog d = new Dog();
    }
}
abstract class Dog {//추상 클래스(객체화 불가)

}

abstract class Cat {
    //추상 메소드
    abstract void crying();//선언부만 존재, 상속받은 클래스에서 무조건 구현해야 함
    void nyanPunch() {
        System.out.println("NEKO PUNCH");
    }
}
class RussianBlue extends Cat {
    @Override
    void crying() {
        System.out.println("Meow");
    }
}
class Danto extends Cat {
    @Override
    void crying() {
        System.out.println("Danto Danto");
    }
}