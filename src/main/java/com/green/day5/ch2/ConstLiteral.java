package com.green.day5.ch2;

public class ConstLiteral {
    public static void main(String[] args) {
        /*
        리터럴: 값 그 자체, 현실에서 얘기하는 상수와 같음.
        상수: 한번 입력된 값이 수정되지 않는 것
         */
        //MAX_SPEED가 상수
        //240이 리터럴
        final int MAX_SPEED = 240;
        //MAX_SPEED = 250; 변경 불가능, 컴파일 에러 발생
        final int MAX_VALUE;
        MAX_VALUE = 10;
    }
}
