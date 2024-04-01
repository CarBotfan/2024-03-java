package com.green.day13.ch6;

public class MyMathTest2 {
    public static void main(String[] args) {
        long r = MyMath2.add(10, 20);
        System.out.println(r);

        MyMath2 myMath2 = new MyMath2();
        long r2 = myMath2.add(8);
        System.out.println(r2);

    }
}

class MyMath2 {
    long n1, n2;
    static long m1, m2;
    long add(long n) {


        if(n == 0) {
            return n;
        }
        return n + add(n - 1);
    }
    static long add(long n1, long n2) {
        return n1 + n2;
    }
}