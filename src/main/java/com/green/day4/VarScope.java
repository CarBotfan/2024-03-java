package com.green.day4;

public class VarScope {
    int num;
    public static void main(String[] args) {
        /*
        스코프 개념은 모든 언어가 동일
        변수가 선언이 되면 그 변수를 감싸고 있는 중괄호 밖으로 나가는 순간 사라짐
         */
        int num = 20;
        if(1 > 0) {
            int num2 = 10;
            System.out.println(num2);
        }
        if(1 > 0) {
            int num2 = 11;
            System.out.println(num2);//스코프가 달라 동일한 이름의 변수 사용가능
        }
        //System.out.println(num2); 사용불가
        int i;
        for(i = 0; i < 10; i++) {
            int bb = 0;

            bb = bb + i;
        }
        System.out.println(i);

        //System.out.println(i); for문에 선언된 index는 for문 안에서 사용 가능
    }
}
