package com.green.day13.ch6;

public class PrimitiveRefEx {
    public static void main(String[] args) {
        int num = 10;

        Numbox nb = new Numbox();
        // new 하는순간 heap 메모리에 저장
        // 최초로 0을 저장 (default = 0)
        // 이 주소값을 복사해서 stack nb에 저장
        nb.num = 10;

        changeNum(num);
        System.out.println(num);

        changeNum(nb);
        System.out.println(nb.num);
    }
    //void, 같은 클래스 안에 존재, static, 메소드명: changeNum, 파라미터 정수값 1개
    public static void changeNum(int n) {
        n = 100;//local 내에서 실행되어 메소드 밖으로 반환되는 값이 없음
    }
    public static void changeNum(Numbox n) {
        n.num = 100;//객체의 주소값을 불러와 그 객체 내부의 속성을 변경함
    }
}


class Numbox {
    int num;

}