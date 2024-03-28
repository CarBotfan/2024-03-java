package com.green.day11.ch5;

public class ArrayEx18 {
    public static void main(String[] args) {
        int[][] score = {
                {100,100,100},
                {20,25,35},
                {30,30,30},
                {40,40,40},
                {50,50,50}
            };
//        int k = 0;
//        for(int i = 0; i < score[k].length; i++) {
//            int sum = 0;
//                for(int j = 0; j < score.length; j++) {
//                    sum += score[j][i];
//                }
//                double average = sum / 4.0;
//                System.out.printf("%d. sum : %d, average : %.2f\n", k, sum ,average);
//                k++;
//        }
        int[] sumArr = new int[score[0].length];
        for(int i = 0; i < score.length; i++) {
            for(int z= 0; z < score[i].length; z++) {
                sumArr[z] += score[i][z];
            }
        }
        for(int i = 0; i < sumArr.length; i++) {
            System.out.println(sumArr[i]);
            double average = sumArr[i] / (double)score.length;
            System.out.println(average);
        }
    }
}
