package com.green.day5;

import java.util.Scanner;
public class Switch2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("성별을 입력해주세요 >> ");
        String gender = scan.nextLine();
        // reference 변수는 객체의 주소값을 저장할 수 있다.
        //객체의 주소값만 저장 가능(객체를 가리키고 있다고 표현)
        //null은 주소값이 없다는 의미(객체를 가리키고 있지 않음)
        //int num = null; //primitive type은  null을 가질 수 없음
        String result = switch (gender) {
            case "남", "남자" -> "당신은 남성입니다.";
            case "여", "여자" -> "당신은 여성입니다.";
            default -> "성별을 입력해주세요";
        };
        System.out.println(result);
    }
}
