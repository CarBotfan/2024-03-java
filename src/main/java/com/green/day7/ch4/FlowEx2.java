package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx2 {
    //Scanner 객체를 이용하여 콘솔에서 문자열값을 가져온 후 받은 문자열을 숫자로 파싱
    //파싱한 숫자가 0이라면 >> 입력하신 숫자는 0입니다 출력
    //            0이 아니라면 >> 입력하신 숫자는 0이 아닙니다.
    //                          입력하신 숫자는 ?입니다.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

//        if(Integer.parseInt(str) == 0) {
//            System.out.printf("입력하신 숫자는 0입니다.\n");
//        } else {
//            System.out.printf("입력하신 숫자는 0이 아닙니다.\n");
//            System.out.printf("입력하신 숫자는 %d입니다.\n",Integer.parseInt(str));
//        }

        int numVal = Integer.parseInt(str);
        String result = switch(numVal) {
            case 0 -> "입력하신 숫자는 0입니다.";
            default -> String.format("입력하신 숫자는 0이 아닙니다." +
                    "\n입력하신 숫자는 %d입니다.\n", numVal);

        };
        System.out.println(result);
    }
}
