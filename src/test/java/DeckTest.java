import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    public Deck deck;

    @Before
    public void setup(){
        deck = new Deck();
    }

    @Test
    public void deckCanPopulate(){
        assertEquals(52, deck.countCards());
    }

    @Test
    public void canDealACard(){
        Card card = deck.dealACard();
        assert(card instanceof Card);
    }
}
