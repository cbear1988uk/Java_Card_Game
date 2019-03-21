import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    public Dealer dealer;
    public Deck deck;

    @Before
    public void setup(){
        dealer = new Dealer();
        deck = new Deck();
    }

    @Test
    public void canDealCard(){
        Card card = dealer.dealCard(deck);
        assert(card instanceof Card);
    }

}
