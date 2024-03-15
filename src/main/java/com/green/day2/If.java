package com.green.day2;

import java.sql.SQLOutput;

public class If {
    public static void main(String[] args) {
        int n1 = 30, n2 = 20;
        if(n1 > n2) {
            System.out.println("n1이 n2보다 초과값입니다.");
        }
        else {
            System.out.println("n1이 n2보다 작습니다.");
        }
        System.out.println("---------------------------------");

        n2 = 10;
        if(n1 > n2) {
            System.out.println("n1이 크다.");
        }
        else if(n1 < n2){
            System.out.println("n1이 작다.");
        }
        else {
            System.out.println("n1과 n2가 같다.");
        }
    }
}
