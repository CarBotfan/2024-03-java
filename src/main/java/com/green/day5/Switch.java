package com.green.day5;

public class Switch {
    /*
        CSS > Cascade Style Sheets
        case문에 진입하면 break를 만날때까지 전부 실행
        switch(체크하고 싶은 값) {
            case 값1:
                작업;
                break;
            case 값2:
                작업;
                break;
                ....case 여러개 작성 가능
            default:
                작업;
                break;
     */
    public static void main(String[] args) {
        int mon = (int)(Math.random() * 12.0) + 1;
        System.out.println(mon);
        switch(mon) {
            case 11:
            case 12:
            case 1:
                System.out.println("겨울");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("봄");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("여름");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("가을");
                break;
            default:
                System.out.println("잘못된 값입니다.");
                break;
        }
    }
}
