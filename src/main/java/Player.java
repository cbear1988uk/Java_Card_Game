import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> cards;

    public Player(String name){
        this.name = name;
        this.cards = new ArrayList<Card>();
    }

    public String getName() {
        return name;
    }

    public void takesCard(Card card) {
        this.cards.add(card);
    }

    public int countCards() {
        return this.cards.size();
    }

    public int cardValue() {
        Card card = this.cards.get(0);
        return card.getRank().getValue();
    }
}
