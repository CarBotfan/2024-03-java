package com.green.day5.ch2;

public class PrintFormat {
    public static void main(String[] args) {
        char c = 'A';
        int finger = 10;
        long big = 100_000_000_000L;
        System.out.printf("c = %c , %d\n",c, (int)c);
        System.out.printf("finger = [%5d]\n", finger);
        System.out.printf("finger = [%-5d]\n", finger);
        System.out.printf("finger = [%05d]\n", finger);
        System.out.println(big);

        int year = 2024;
        int mon = 3;
        int day = 20;
        System.out.printf("%4d-%02d-%02d", year, mon, day);
        System.out.println();

        String url = "www.green.com";
        float f1 = 0.10f;// 0.10f 와 동일
        //리터럴 실수는 double 타입
        //끝에 f or F를 붙이면 float 타입의 리터럴이 됨
        double d = 1.23456789;

        System.out.printf("url = %s\n",url);
        System.out.printf("%f\n", f1);
        System.out.printf("%.10f\n", d);

        System.out.printf("%20s\n",url);
        System.out.printf("[%-20s]\n",url);
    }
}
