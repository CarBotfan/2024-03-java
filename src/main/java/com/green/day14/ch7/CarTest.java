package com.green.day14.ch7;

public class CarTest {
    public static void main(String[] args) {
        //is a has a
        //아반떼는 차이다(is a=상속)
        //차에는 스피커가 있다(has a = 포함관계)
    }
}

class Car {
    int cc;
    String company;
    Speaker speaker;

    void drive() {
        System.out.println("*engine sound intensifies*");
    }
}

class Avante extends Car {

}
class Speaker {
    int volume;
    void play() {
        System.out.println("*music sound*");
    }
}