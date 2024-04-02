package com.green.day14.ch6;
//p.294 매개변수 있는 생성자
public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("White", "auto", 5);
        c1.color = "white";
        System.out.println(c1.color + c1.gearType + c1.door);
        Car c2 = new Car("Black", "manual", 3);
        c2.color = "black";
        System.out.println(c2.color + c2.gearType + c2.door);
        Car c3 = new Car();
        System.out.println(c3.color + c3.gearType + c3.door);

        Car c4 = new Car(c2);
        c4.color = "Black";
        System.out.println(c4.color + c4.gearType + c4.door);
        System.out.println(c2.color + c2.gearType + c2.door);
    }
}
class Car {
    String color;
    String gearType;
    int door;
    public Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
    public Car(Car car) {
        this(car.color, car.gearType, car.door);
    }
    public Car() {
        this("Red", "manual", 4);//생성자 메소드에서 다른 생성자 메소드 호출 가능
        init();// 별도의 메소드를 호출해서 속성 초기화 가능
    }
    void init() {

    }
    void start() {
        System.out.println("엔진 가동!");
    }
}
