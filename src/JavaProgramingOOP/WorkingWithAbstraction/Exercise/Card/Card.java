package JavaProgramingOOP.WorkingWithAbstraction.Exercise.Card;

public class Card {

    private CardSuit cardSuit;
    private CardRank cardRank;

    public Card(String cardSuit, String cardRank) {
        this.cardSuit = CardSuit.valueOf(cardSuit);
        this.cardRank = CardRank.valueOf(cardRank);
    }

    public  int calculatePower() {
        return cardSuit.getPower() + cardRank.getPower();

    }
}
