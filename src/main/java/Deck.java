import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<Card>();
        this.populate();
//        this.shuffle();
    }

    public int countCards() {
        return this.cards.size();
    }

    public void populate() {
        for(SuitType suit : SuitType.values()){
            for(RankType rank : RankType.values()){
                Card card = new Card(suit, rank);
                this.cards.add(card);
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(this.cards);
    }

    public Card dealACard(){
        return this.cards.remove(0);
    }
}

