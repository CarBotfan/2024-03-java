package com.green.day6.ch2;

public class OverflowUnderflow {
    public static void main(String[] args) {
        int i = 129;
        byte b = 0;

        int n3 = 1000; // n3를 byte로 형변환
        //형변환 할수 있는 값인지 체크하는 if문
        if(Byte.MAX_VALUE >= n3 && Byte.MIN_VALUE <= n3) {
            byte b3 = (byte)n3;
            System.out.println(b3);
        }
        int i2 = -129;
        if(Byte.MAX_VALUE >= i) {
            b = (byte) i;
            System.out.println("b : " + b);
        }
        if(Byte.MIN_VALUE <= i2) {
            byte b2 = (byte)i2;
            System.out.println("b2 : " + b2);
        }
    }
}
