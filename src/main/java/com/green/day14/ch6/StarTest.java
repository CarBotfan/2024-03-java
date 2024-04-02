package com.green.day14.ch6;

public class StarTest {
    public static void main(String[] args) {
        Star star = new Star();
        star.singlePrint(5);
        star.singlePrint(7);
        System.out.println("____________________");
        star.squarePrint(5);
        System.out.println("--------------------");
        star.trianglePrint(4);
        System.out.println("----------------------");
        star.trianglePrint_2(4);
        System.out.println("-----------------------");
        star.diamondPrint(15);
    }
}
class Star {
    void singlePrint(int num) {
        for(int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    void singlePrint_2(int num) {
        for(int i = 0; i < num; i++) {
            System.out.print("*");
        }
    }
    void singleSpacePrint(int num) {
        for(int i = 0; i < num; i++) {
            System.out.print(" ");
        }
    }
    void squarePrint(int n1) {
        for(int i = 0; i < n1; i++) {
            singlePrint(n1);
        }
    }
    void trianglePrint(int num) {
        for(int i = 1; i <= num; i++) {
            singlePrint(i);
        }
    }
    void trianglePrint_2(int num) {
        for(int i = 1; i <= num; i++) {
            singleSpacePrint(num - i);
            singlePrint_2(i);
            singlePrint_2(i);
            System.out.println();
        }

    }
    void trianglePrint_2_Rev(int num) {
        for(int i = num; i >= 1; i--) {
            singleSpacePrint(num - i);
            singlePrint_2(i);
            singlePrint_2(i);
            System.out.println();
        }

    }
    void diamondPrint(int num) {
        trianglePrint_2(num);
        trianglePrint_2_Rev(num);
    }
}