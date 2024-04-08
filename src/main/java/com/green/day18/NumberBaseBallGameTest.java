package com.green.day18;

import java.util.Arrays;

public class NumberBaseBallGameTest {
    public static void main(String[] args) {
        NumberBaseBallGame game = new NumberBaseBallGame(3);
        System.out.println(Arrays.toString(game.getNumArr()));
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
            System.out.printf("%d. %d <-> %d. %d\n", i, numbers[i], randomNum, numbers[randomNum]);
            numbers[i] = numbers[randomNum];
            numbers[randomNum] = temp;
        }
        System.out.println(Arrays.toString(numbers));
        for(int i = 0; i < NUMBER_COUNT; i++) {
            numArr[i] = numbers[i];
        }
    }
    int[] getNumArr() {
        return numArr;
    }
    void start() {
        int strike = 0, ball = 0, out = 0;
        while(true) {
            if(strike == 3) {
                break;
            }
        }
    }
}