package oop.design.deckofcards;

public class Card {
    enum Ranks {
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING,
        ACE
    }

    enum SuiteType {
        DIAMOND,
        CLUB,
        HEART,
        SPADE
    }

    private SuiteType suite;
    private Ranks rank;

    public Card(Ranks rank, SuiteType s) {
        this.rank = rank;
        this.suite = s;
    }

    public SuiteType getSuite() {
        return suite;
    }

    public Ranks getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suite=" + suite +
                ", rank=" + rank +
                '}';
    }

    public boolean equals(Card c){
        if (this.suite == c.suite &&
                this.rank == c.rank){
            return true;
        }
        else return false;
    }

}
