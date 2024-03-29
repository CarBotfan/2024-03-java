package com.green.day12.ch6;

public class MyMathTest {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        myMath.add(10, 30);
        myMath.minus(100, 50);
        myMath.minus(200, 50);
        System.out.println(myMath.returnAdd(500, 600));

    }
}

class MyMath {
    void method1() {

    }
    void add(int n1, int n2) {
        System.out.println(n1 + n2);
    }
    //리턴타입 메소드명 파라미터
    // { } 부분은 > 메소드 구현부
    void minus(int n1, int n2) {
        System.out.println(n1 - n2);
    }
    int returnAdd(int n1, int n2) {
        return n1 + n2;
    }

}
class Weapon {
    String name;
    int durability = 100;
    int damage;
    boolean status = true;
    int atkSpeed;
    int weight;
    public Weapon(String name, int damage, int atkSpeed, int weight) {
        this.name = name;
        this.damage = damage;
        this.atkSpeed = atkSpeed;
        this.weight = weight;
    }
    void Attack() {
        durability -= 2;
        if(durability <= 0) {
            this.setBroken();
        }
    }
    void setBroken() {
        durability = 0;
        status = !status;
        System.out.printf("%s is broken\n", name);
    }
}

