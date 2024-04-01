package com.green.day13.ch6;

public class OverloadingTest {
    public static void main(String[] args) {

    }
}
/*
    오버로딩은 매개변수로 구분만 되면 작성 가능(매개변수의 타입, 개수 등등)
    리턴타입은 상관 x
 */
class MyMath3 {
    int add(int n1, int n2) {
        return n1 + n2;
    }
    int add(int n1, double n2) {
        return 0;
    }
}
