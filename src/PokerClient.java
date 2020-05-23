import java.util.ArrayList;
import java.util.List;

public class PokerClient {

    public Card card1;
    public Card card2;
    public Card card3;
    public Card card4;
    public Card card5;

    public PokerClient(String p1, String p2, String p3, String p4, String p5) {
        this.card1 = new Card(p1.toUpperCase());
        this.card2 = new Card(p2.toUpperCase());
        this.card3 = new Card(p3.toUpperCase());
        this.card4 = new Card(p4.toUpperCase());
        this.card5 = new Card(p5.toUpperCase());
    }

    public boolean highestCardIsMine(String p1, String p2, String p3, String p4, String p5) {
        Card highCard = new Card("s2");
        List<Card> firstPlayerCards = new ArrayList<>();
        List<Card> secondPlayerCards = new ArrayList<>();
        firstPlayerCards.add(new Card(p1.toUpperCase()));
        firstPlayerCards.add(new Card(p2.toUpperCase()));
        firstPlayerCards.add(new Card(p3.toUpperCase()));
        firstPlayerCards.add(new Card(p4.toUpperCase()));
        firstPlayerCards.add(new Card(p5.toUpperCase()));
        secondPlayerCards.add(card1);
        secondPlayerCards.add(card2);
        secondPlayerCards.add(card3);
        secondPlayerCards.add(card4);
        secondPlayerCards.add(card5);


        for(int i = 0; i < firstPlayerCards.size(); i++){
            Card secondPlayerCard = secondPlayerCards.get(i);
            for (Card firstPlayerCard : firstPlayerCards) {
                if (firstPlayerCard.getValue() >= secondPlayerCard.getValue() &&
                        secondPlayerCard.getValue() >= highCard.getValue()) {
                    highCard = firstPlayerCard;
                } else {
                    highCard = secondPlayerCard;
                }
            }
        }


        return secondPlayerCards.contains(highCard);
    }

}