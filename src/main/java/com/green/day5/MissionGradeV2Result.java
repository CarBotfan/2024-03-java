package com.green.day5;

public class MissionGradeV2Result {
    public static void main(String[] args) {
        int score = (int) (Math.random() * 131.0) - 10;
        int val1 = score / 10;
        int val2 = score % 10;
        System.out.println(score);
        while(true) {
            String grade = "A";
            String symbol = "+";
            if(score < 0 || score > 100) {
                System.out.println("잘못된 점수");
                break;
            }
            else if(score < 100) {
                int tenDigit = score / 10;
                grade = switch (tenDigit) {
                    case 9 -> "A";
                    case 8 -> "B";
                    case 7 -> "C";
                    default -> {
                        symbol = "";
                        yield "F";
                    }
                };

                if(tenDigit > 6) {
                    int oneDigit = score % 10;
                    if(oneDigit < 3) {
                        symbol = "-";
                    } else if(oneDigit < 7) {
                        symbol = "";
                    }
                }
            }
            System.out.printf("%s%s\n", grade, symbol);
            break;
        }
    }
}
