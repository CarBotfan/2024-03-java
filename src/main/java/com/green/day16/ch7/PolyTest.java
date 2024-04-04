package com.green.day16.ch7;
/*<다형성 대전제 3가지>
1. 부모 타입의 변수는 자식 객체의 주소값을 담을 수 있음
2. 자식 타입의 변수는 부모 객체의 주소값을 담을 수 없음
3. 타입은 알고 있는 메소드만 호출할 수 있고 실행되는 기준은 객체 기준이다.
 */
public class PolyTest {
    public static void main(String[] args) {
        Animal ani_1 = new Dog();
        Animal ani_2 = new BullDog();
        Animal ani_3 = new Cat();
        Dog dog_1 = new BullDog();
//        Dog dog_2 = new Animal();//자식 타입의 변수는 부모 객체의 주소값을 담을 수 없음
//        Dog dog_3 = (Dog)new Animal();//컴파일 에러
        //자식 객체는 더 많은 메소드를 가지고 있을 수 있으므로 부모 객체를 담을 수 없음
        ani_1.crying();
        //ani_1.sleep();//animal 클래스엔 sleep이라는 메소드가 없으므로 이 객체에서는 실행 불가
        Dog dog_4 = (Dog)ani_1;//Dog로 형변환해 저장 시 sleep 메소드 사용가능
        ((Dog)ani_1).sleep();
        dog_4.sleep();
        BullDog bullDog_1 = (BullDog)ani_2;
        bullDog_1.sleep();//BullDog로 형변환 시 메소드 사용가능
        System.out.println("종료");
    }
}

class Animal {
    void crying() {
        System.out.println("동물이 운다");
    }
}

class Dog extends Animal {//crying을 오버라이딩
    void crying() {
        System.out.println("강아지가 멍멍");
    }
    void sleep() {
        System.out.println("강아지가 잔다");
    }
}
class BullDog extends Dog {
    void crying() {
        System.out.println("불독이 월월");
    }

    @Override
    void sleep() {
        System.out.println("불독이 잔다");
    }
}
class Cat extends Animal {
    @Override
    void crying() {
        System.out.println("고양이가 야옹");
    }
}