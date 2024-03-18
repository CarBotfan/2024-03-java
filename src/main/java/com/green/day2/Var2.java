package com.green.day2;

public class Var2 {
    int globalNum;
    public static void main(String[] args) {
        int num = 10, num2 = 11, num3 = 0;

        num3 = num + num2;
        num3 += 3;
        num3++;
        num3--;
        System.out.println(num3);
    }
}
//Primitive Type
//정수형 byte, short, int, long
//실수형 float, double
//불린형 boolean
//문자형 char
