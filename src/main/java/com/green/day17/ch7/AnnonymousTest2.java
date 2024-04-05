package com.green.day17.ch7;

public class AnnonymousTest2 {
    public static void main(String[] args) {
        Movable m1 = new MyMove();
        m1.move();
        Movable m2 = new Movable() {//익명 클래스 기법, 별도의 클래스 정의 없이 바로 객체 생성 가능
            public void move() {
                System.out.println("일본으로 이동");
            }
        };
        m2.move();
    }
}

interface Movable {
    void move();
}
class MyMove implements Movable {
    public void move() {
        System.out.println("서울까지 이동");
    }
}