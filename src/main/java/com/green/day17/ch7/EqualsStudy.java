package com.green.day17.ch7;

public class EqualsStudy {
    public static void main(String[] args) {
        Numbox n1 = new Numbox(10);
        Numbox n2 = new Numbox(10);
        System.out.println(n1.equals(n2));
        //Object에서 직접 상속받은 equals는 String의 오버라이딩된 equals와는 다르게 주소를 비교함
    }
}

class Numbox {
    private int num;
    Numbox(int num) {
        this.num = num;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Numbox){
        return ((Numbox)obj).num == num;
        }
        return false;

    }
}
