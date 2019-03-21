
public class Dealer {

    private Deck decks;

    public Dealer(){
        decks = new Deck();
    }

    public Card dealCard(Deck deck) {
        return deck.dealACard();
    }
}
