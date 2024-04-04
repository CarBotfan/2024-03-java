package com.green;

public interface PlayingCard {
    //public static final이 자동으로 추가됨
    int CLOVER = 1;
    //public abstract
    String getCardNumber();
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
        PlayingCard pc = new PlayCard();
        pc.getCardNumber();
        ((DeepPlayingCard)pc).getCardKind();//getCardKind 메소드 사용가능한 형태로 형변환
        System.out.println("---------------------------");
    }
}