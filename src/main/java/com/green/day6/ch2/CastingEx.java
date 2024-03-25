package com.green.day6.ch2;

public class CastingEx {
    public static void main(String[] args) {
        //primitive type, reference type 같은 카테고리끼리는 형변환 가능
        //primitive type > reference type으로 형변환 불가, 이때는 파싱 처리(Wrapper 타입 제외)
        int n1 = 10;
        Integer n2 = n1;

        double d1 = 10.0;
        Double d2 = d1;

        //강제형변환, 자동형변환

        //자동형변환되는 방향(반대는 강제형변환)
        //byte > short > int >long > float > double > String(논외)
        long l1 = 100000000L;
        float f1 = l1;
        System.out.println(f1);
        long l2 = (long)f1;
        System.out.println(l2);
    }
}
