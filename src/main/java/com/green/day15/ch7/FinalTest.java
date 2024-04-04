package com.green.day15.ch7;

import javax.crypto.spec.PSource;

public class FinalTest {

    public static void main(String[] args) {
        Car c = new Car(2200);
        Car c2 = new Car(2500);
//        c.cc = 100;한번 입력된 후에는 값 변경 불가
        System.out.println(c.CC);
        System.out.println(c2.CC);
    }
}

class Car {
    final int CC;//생성자를 이용해 Lazy 처리 가능
    Car(int cc) {
        this.CC = cc;
    }
    final void start() {//final 메소드는 오버라이딩 불가(최종 단계?)
        System.out.println("엔진 가동");
    }
}

final class Suv extends Car { //클래스 앞에 final이 붙으면 상속 불가
    Suv(int cc) {
        super(cc);
    }
//    void start() {}
}