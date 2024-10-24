package com.pluralsight;

public class PokerPlayer {
    private Hand hand;
    private String name;

    public PokerPlayer(Hand hand, String name) {
        this.hand = hand;
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
