package com.green.day11.ch5;

import java.util.Arrays;

public class MultiArrayStudy {
    public static void main(String[] args) {
        int[][] mulArray = new int[3][5];

        mulArray[0][0] = 5;
        for(int i = 0; i < mulArray.length; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.printf("%d\t", mulArray[i][j]);
            }
            System.out.println();
        }
        System.out.println("mulArray.length " + mulArray[0].length);
        int tmp = mulArray[0].length;
        System.out.println(tmp);
    }
}
