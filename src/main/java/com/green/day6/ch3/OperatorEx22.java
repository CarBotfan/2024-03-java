package com.green.day6.ch3;

public class OperatorEx22 {
    public static void main(String[] args) {
        float f = 0.1f;
        double d = 0.1;
        double d2 = f;

        System.out.println(10.0 == 10.0f);
        System.out.println(f == d);
        System.out.println((double)f == d);
        System.out.println(f == (float)d);

    }
}
