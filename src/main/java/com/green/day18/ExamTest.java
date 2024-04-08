package com.green.day18;

public class ExamTest {
    public static void main(String[] args) {
        int rVal = Exam.getRandomValue(1, 101);
        int rVal2 = Exam.getRandomValue(1, 101);
        Exam.printOddEven(rVal);
        Exam.printOddEven(rVal2);
        for(int i = 100; i < 104; i++) {
            System.out.println(200 - i);
        }
        Exam.test(rVal, rVal2);
        Exam.printNumToNum(4, 22);
        for(int i = 0; i < 20; i++) {
            int score = Exam.getRandomValue(60, 101);
            System.out.println("score: " + score);
            String grade = Exam.getGrade(score);
            System.out.println(grade);
        }
        String grade = Exam.getGrade(100);
        System.out.println(grade);
        int sum = Exam.getSumFromTo(8, 20);
        System.out.println("sum: " + sum);
    }
}

class Exam {
    static int getRandomValue(int a, int b) {
        int rVal = (int)(Math.random() * (b - a)) + a;
        return rVal;
    }
    static void printOddEven(int rVal) {
        System.out.printf("%d는(은) %c수입니다.\n", rVal, rVal % 2 == 0 ? '짝' : '홀');
    }
    static void test (int val1, int val2) {
        if(val1 % 2 == 0) {
            if(val2 % 2 == 0) {
                System.out.println(val2 - val1);
            }
            else {
                System.out.println(val1);
            }
        }
        else {
            if(val2 % 2 == 0) {
                System.out.println(val2 - 5);
            }
            else {
                System.out.println(val2);
            }
        }
    }
    static void printNumToNum(int a, int b) {
        for(int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }
    static String getGrade(int score) {
        if(score < 0 || score > 100) {
            return "점수가 잘못되었습니다";
        }
        String grade = switch(score / 10) {
            case 10 -> "A+";
            case 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            default -> "F";
        };
        if(score / 10 > 6 && score / 10 < 10) {
            switch (score % 10) {
                case 0, 1, 2 -> grade += "-";
                case 7, 8, 9 -> grade += "+";
                default -> grade += "0";
            }
        }

        return grade;
    }
    static int getSumFromTo(int a, int b) {
        int sum = 0;
        for(int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }
}
