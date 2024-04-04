package com.green.day15.ch7;

public class ConstructorTest {
    public static void main(String[] args) {

    }
}
//부모의 생성자에 매개변수가 있을 경우 자식 클래스에서도 그 값을 넣어줘야만 올바르게 작동함
//super()를 이용해 매개변수 전달 가능
class Animal {
    int age;
    public Animal(int age) {
        this.age = age;
    }
    public Animal(){}
}
class Tiger extends Animal {//상속
    String name;
    Tiger(String name) {
        super(10);//자식 클래스를 객체화할때 부모 클래스도 같이 객체화됨
        this.name = name;//This()는 생성자 호출
    }
    Tiger() {

    }
}