package com.green.day13.ch6;

public class CallStackTest {
    public static void main(String[] args) {
        firstMethod();//static 호출, 같은 class 내에 있을때 . 없이 메소드 호출 가능
        CallStackTest.firstMethod(); // 타 class 내에 있을때 . 사용해 호출 가능
    }

    public static void firstMethod() {
        System.out.println("call firstMethod");
        secondMethod();
    }

    public static void secondMethod() {
        System.out.println("call secondMethod");
    }
}
