package com.green.day18;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseBallGameTest {
    public static void main(String[] args) {
        NumberBaseBallGame game = new NumberBaseBallGame(3);
        System.out.println(Arrays.toString(game.getNumArr()));
        game.start();
    }
}

class NumberBaseBallGame {
    final int NUMBER_COUNT;
    static final int MIN_NUMBER = 1;
    static final int DEFAULT_NUMBER = 3;
    static final int MAX_NUMBER = 9;

    private int[] numArr;
    NumberBaseBallGame(final int NUMBER_COUNT) {
        if(NUMBER_COUNT < MIN_NUMBER || NUMBER_COUNT > MAX_NUMBER) {
            this.NUMBER_COUNT = DEFAULT_NUMBER;
        }
        else{this.NUMBER_COUNT = NUMBER_COUNT;}
        this.init();
    }
    private void init() {
        this.numArr = new int[NUMBER_COUNT];
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        for(int i = 0; i < numbers.length; i++) {
            int randomNum = (int)(Math.random() * 9);
            int temp = numbers[i];
            numbers[i] = numbers[randomNum];
            numbers[randomNum] = temp;
        }
        for(int i = 0; i < NUMBER_COUNT; i++) {
            numArr[i] = numbers[i];
        }
    }
    int[] getNumArr() {
        return numArr;
    }
    void start() {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.printf("숫자 %d개 입력 (space로 구분)>> ", NUMBER_COUNT);
            String strAnswer = scan.nextLine();
            int[] answerArr = this.changeArr(strAnswer);
            if(answerArr.length != NUMBER_COUNT) {
                System.out.println("잘못된 입력입니다. 다시 입력하세요");
                continue;
            }
            int strike = 0, ball = 0;
            for(int i = 0; i < numArr.length; i++) {
                for(int j = 0; j < answerArr.length; j++) {
                    if(numArr[i] == answerArr[j] && i == j) {
                        strike++;
                        break;
                    } else if(numArr[i] == answerArr[j] && i != j) {
                        ball++;
                        break;
                    }
                }
            }
            System.out.printf("Strike: %d, Ball: %d, Out: %d\n", strike, ball, NUMBER_COUNT - (strike + ball));
            if(strike == numArr.length) {
                break;
            }
        }
        scan.close();
        System.out.println("you win\n");
    }
    int[] changeArr(String str) {
        String[] strArr = str.split(" ");
        int[] numArr = new int[strArr.length];
        for(int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }
        return numArr;
    }
}