package com.green.day3;

public class MultipleForLoop2 {
    public static void main(String[] args) {
        for(int z = 0; z < 5; z++) {
            for(int i = 0; i < 5; i++) {
                System.out.printf("%d - %d\n", z, i);
            }
            System.out.println("-------");
        }
    }
}
