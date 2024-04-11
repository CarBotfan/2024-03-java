package com.green.day19.blackjack;

public class Rule {
    void whoIsWinner(final Gamer gamer, final Dealer dealer) {
        final int MAX_SCORE = 21;
        int dealerScore = dealer.getScore();
        int gamerScore = gamer.getScore();
        if((dealerScore > MAX_SCORE && gamerScore > MAX_SCORE) || (dealerScore == gamerScore)) {
            System.out.println("Draw");
        }
        else if(dealerScore > gamerScore) {
            if(dealerScore > MAX_SCORE) {
                System.out.println("Player wins");
                return;
            }
            System.out.println("Dealer wins");

        }
        else {
            if(gamerScore > MAX_SCORE) {
                System.out.println("Dealer wins");
                return;
            }
            System.out.println("Player wins");

        }
        System.out.println("Player Score: " + gamerScore);
        System.out.println("Player hand >> " + gamer.openCards());
        System.out.println("Dealer Score: " + dealerScore);
        System.out.println("Dealer hand >> " + dealer.openCards());
    }
}
