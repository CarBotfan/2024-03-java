package com.green.day6.ch3;

public class AssignmentOperator {
    public static void main(String[] args) {
        int x, y, z;
        //left value(저장할 수 있는 공간)
        //right value(연산식, 변수, 리터럴)
        x = y = z = 3;
        //y = 3;
        //x = y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        int n = 1;
        n = n + 1;
        n = n + 2;
        n = n + 3;
        System.out.println(n);
        //복합 대입 연산자
        //+, -, *, /, % 사용가능
        int m = 1;
        m += 1;
        m += 2;
        m += 3;
        System.out.println(m);
        int k1 = 10, k2 = 3;
        k1 %= k2;
        System.out.println(k1);
    }
}
