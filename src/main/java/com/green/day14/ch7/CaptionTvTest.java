package com.green.day14.ch7;

public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv cTv = new CaptionTv();
        cTv.channel = 10;
        cTv.power();
        cTv.channelDown();
        cTv.channelUp();
        System.out.println(cTv.channel);
        cTv.caption = true;
        cTv.displayCaption("xx");
    }
}

class Tv {
    boolean power;
    int channel;

    void power() {
        power = !power;
    }
    void channelUp() {
        channel++;
    }
    void channelDown() {
        channel--;
    }
}
class VideoTv extends Tv {

}
class CaptionTv extends Tv {
    boolean caption;
    void displayCaption(String text) {
        if(caption) {
            System.out.println(text);
        }
    }
}//상속에서 수직 관계 이외에는 전부 남이다
 //다중 상속 불가