package com.green.day19.blackjack;

public class Card {
    private String pattern;
    private String denomination;
    public Card(String pattern, String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getPattern() {
        return pattern;
    }

    public String getDenomination() {
        return denomination;
    }
    @Override
    public String toString() {
        return String.format("%s(%s)", pattern, denomination);
    }
    public int getScore() {
        switch(denomination) {
            case "K", "Q", "J" : return 10;
            case "A" : return 1;
            default : return Integer.parseInt(denomination);
        }
    }
}

class CardTest {
    public static void main(String[] args) {
        Card c = new Card("Spade", "9");
        System.out.println(c);
        String pattern = c.getPattern();
        String denomination = c.getDenomination();

        int score = c.getScore();
        System.out.println(score);
    }
}