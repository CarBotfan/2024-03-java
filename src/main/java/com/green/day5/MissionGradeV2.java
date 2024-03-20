package com.green.day5;

public class MissionGradeV2 {
    public static void main(String[] args) {
        int score = (int)(Math.random() * 131.0) - 10;
        int val1 = score / 10;
        int val2 = score % 10;
        System.out.println(score);
        switch(val1) {
            case 10:
                if(val2 == 0){
                    System.out.println("A+");
                }
                else{
                    System.out.println("잘못된 점수");
                }
                break;
            case 9:
                switch(val2) {
                    case 0, 1, 2 -> System.out.println("A-");
                    case 3, 4, 5, 6 -> System.out.println("A0");
                    case 7, 8, 9 -> System.out.println("A+");
                }
                break;
            case 8 :
                switch(val2) {
                    case 0, 1, 2 -> System.out.println("B-");
                    case 3, 4, 5, 6 -> System.out.println("B0");
                    case 7, 8, 9 -> System.out.println("B+");
                }
                break;
            case 7 :
                switch(val2) {
                    case 0, 1, 2 -> System.out.println("C-");
                    case 3, 4, 5, 6 -> System.out.println("C0");
                    case 7, 8, 9 -> System.out.println("C+");
                }
                break;
            case 6, 5, 4, 3, 2, 1, 0 :
                System.out.println("F");
                break;
            default :
                System.out.println("잘못된 점수");
                break;
        }
    }
}
