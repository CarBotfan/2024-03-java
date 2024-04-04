package com.green.day15.ch7;

public class OverrideTest {
    public static void main(String[] args) {
        Parent p = new Parent(55);
        System.out.println(p.age);
        Child child = new Child();
        child.doubleAttack();

    }
}


class Parent {
    int age;//전역변수는 객체가 살아 있는 한 유지
    Parent(int age) {
        this.age = age;//이름이 같으므로 this로 전역 변수 지칭
    }
    Parent() {

    }
    public void attack() {
        System.out.println("부모가 적을 공격한다.");
    }
    public void defense() {
        System.out.println("부모가 적의 공격을 방어한다.");
    }
}

class Child extends Parent {
    int mzPower;
    public Child() {
        super();//별도의 입력 없이도 자동으로 들어감 , 상위 부모 클래스의 생성자 호출
    }
    public Child(int age) {
        super(age);
    }
    @Override//오버라이딩이 맞는지 체크하는 역할
    public void attack() {//부모의 메소드를 재정의, 오버라이딩된 메소드는 우선순위를 가짐
        System.out.println("자식이 적을 공격한다.");
    }
    public void doubleAttack() {
        this.defense();
        super.defense();
        this.attack();
        super.attack();
    }
}