package com.green.day15.ch7;
//자바 파일을 관리하기 위해 분류하는 용도로 패키지 사용
//똑같은 이름의 클래스를 구분하기 위해서
import com.green.day12.ch6.Card;//같은 이름의 클래스 2개는 import 불가
import com.green.day14.ch6.MyArrays;
import static com.green.day14.ch6.MyArrays.printArr;//다른 패키지의 static 함수를 가져옴

public class PackageTest {
    public static void main(String[] args) {
        Card c = new Card();
        com.green.day12.ch6.Card card2 = new com.green.day12.ch6.Card();

        int[] arr = {1, 2, 3};
        MyArrays.printArr(arr);
        printArr(arr);//import한 스태틱 메소드
        //static 멤버 필드, 메소드는 1개의 공간만이 존재하며, 프로그램과 함께 메모리에 로드됨
        //static으로 선언된 것은 객체화 없이도 호출해 사용 가능
        //객체별로 값을 저장하는데 사용할 수 없음
        //객체 별로 값을 저장하는데는 instance 멤버필드, 메소드 사용

    }
}
