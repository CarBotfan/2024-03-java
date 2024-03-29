package com.green.day12.ch6;

public class Variable {
    int iv;//인스턴스 변수, 전역 변수
    static int cv;//클래스 변수, 스태틱 변수
    //클래스 이름으로 접근해서 사용
    //객체화와 무관하게 사용

    void method() {
        int lv = 0;//지역 변수(local variable)
    }
    static void staticMethod() {
        int lv = 0;
    }
}
