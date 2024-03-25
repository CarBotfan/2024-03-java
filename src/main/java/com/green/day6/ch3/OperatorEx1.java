package com.green.day6.ch3;

public class OperatorEx1 {
    public static void main(String[] args) {
        int n1 = 3, n2 = 5;
        int r1 = (-n1) - n2;
        System.out.println("r1 : " + r1);

        int r2 = n1 + n2 * n1 / n2;

        System.out.println(r2);

        int r3 = n1 +((n2 * n1) / n2);
        System.out.println(r3);

        int i = 5;
        System.out.println(++i);

        i = 5;
        System.out.println(i++);
        int k = 10;
        System.out.println(k++);//10
        System.out.println(++k);//12
        System.out.println(++k);//13
        System.out.println(k++);//13
        System.out.println(k);//14
    }
}
