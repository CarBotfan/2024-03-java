package com.green.day16.ch7;

public interface PlayingCard {
    //public static final이 자동으로 추가됨
    int CLOVER = 1;
    //public abstract
    String getCardNumber();
}

class PlayCardImpl implements PlayingCard {

    @Override
    public String getCardNumber() {
        return null;
    }
}

interface DeepPlayingCard extends PlayingCard {
    String getCardKind();
}
class PlayCard implements DeepPlayingCard{
    @Override
    public String getCardNumber() {
        return null;
    }

    @Override
    public String getCardKind() {
        return null;
    }
}

class PlayCardTest {
    public static void main(String[] args) {
        PlayingCard pc = new PlayCard();//playingcard의 객체 주소값 + 나를 상속받은 객체의 주소값, implements 한 객체 주소값을 담을 수 있음
        pc.getCardNumber();
        ((DeepPlayingCard)pc).getCardKind();//getCardKind 메소드가 포함된 자료형으로 형변환
        PlayingCard pc2 = new PlayCardImpl();
        //DeepPlayingCard dpc = (DeepPlayingCard)pc2;
        //? ddd = new PlayCardSecond();
        //PlayingCard, PlayCardSecond, Object
        DeepPlayingCard dpc2 = (DeepPlayingCard)pc;
        System.out.println("---------------------------");
    }
}