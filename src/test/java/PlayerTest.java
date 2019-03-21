import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    public Player player1;
    public Player player2;
    public Deck deck;

    @Before
    public void setup(){
        player1 = new Player("Steve");
        player2 = new Player("Louise");
        deck = new Deck();
    }

    @Test
    public void playerHasName(){
        assertEquals("Steve", player1.getName());
    }

    @Test
    public void canGetCard(){
        Card card = deck.dealACard();
        player1.takesCard(card);
        assertEquals(1, player1.countCards());
    }

    @Test
    public void checkCard(){
        Card card = deck.dealACard();
        player1.takesCard(card);
        int rank = card.getRank().getValue();
        assertEquals(rank, player1.cardValue());
    }
}
