package oop.design.deckofcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
    public static final int size = 52;
    private List<Card> deckOfCards;
    private int currCard;

    public Deck() {
        deckOfCards = new ArrayList<>();

        int i = 0;
        for (Card.Ranks rank: Card.Ranks.values()){
            for (Card.SuiteType suite: Card.SuiteType.values()){
                deckOfCards.add(new Card(rank, suite));
            }
        }
        currCard = 0;
    }

    public Card deal() {
        if (currCard < size){
            return deckOfCards.get(currCard++);
        }
        else {
            System.out.println("Deck is out of cards");
            return null;
        }
    }

    public void shuffle() {
        Collections.shuffle(deckOfCards);
    }

    @Override
    public String toString() {
        return "Deck{" +
                "deckOfCards=" + deckOfCards +
                '}';
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println(deck.toString());

    }
}
