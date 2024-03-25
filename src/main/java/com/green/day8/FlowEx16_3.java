package com.green.day8;

public class FlowEx16_3 {
    public static void main(String[] args) {
        int star = 10;
        for(int i = 0; i < star; i+=2) {
            for(int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
