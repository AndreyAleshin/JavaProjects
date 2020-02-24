package com.brainacad.andreyaa.lms.java_fundamentals.lab2_13_enums.lab2_13_4;

class Card {

    private Suit cardSuit;
    private Rank cardRank;

    Card(Rank cardRank, Suit cardSuit) {
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
    }

    @Override
    public String toString() {
        return "The card: " + cardRank + "_" + cardSuit;
    }

}
