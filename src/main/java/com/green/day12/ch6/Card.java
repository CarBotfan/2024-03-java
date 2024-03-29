package com.green.day12.ch6;
//p.247
//private/default/protected/public
//private:내부에서만 쓸 수 있음, 밖에서 접근 불가
//default: 클래스 내부 / 같은 패키지 안에서 사용 가능
//protected: 클래스 안에서, 같은 패키지 안에서, 상속관계인 경우 사용가능
//public: 공용 / 모든 패키지에서 사용가능
public class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;//모든 Card 객체가 공유함
}

