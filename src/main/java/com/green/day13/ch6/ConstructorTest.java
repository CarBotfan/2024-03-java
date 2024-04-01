package com.green.day13.ch6;

//1.생성자 함수는 클래스와 이름이 같다. 2.리턴 타입이 없음
// 생성자 사용 이유 1.객체 생성 2.생성과 동시에 멤버필드 초기화

public class ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1();
        Data2 d2 = new Data2(1);
        System.out.println(d2.value);
        Data2 d2_2 = new Data2();
        System.out.println(d2_2.value); //100
}
}

class Data1 {
    int value;
    public Data1() {//기본 생성자(생성자가 없을 경우 컴파일러가 자동 추가)
        System.out.println("Data1 constructor called");
    }
}

class Data2 {
    int value;
    public Data2(int param) {
        value = param;
    }
    public Data2() {
        value = 100;
    }
}