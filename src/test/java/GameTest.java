import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    public Game game;
    public Player player1;
    public Player player2;
    public Deck deck;
    public Dealer dealer;

    @Before
    public void setup(){
        game = new Game();
        player1 = new Player("Steve");
        player2 = new Player("Louise");
        deck = new Deck();
        dealer = new Dealer();
    }

    @Test
    public void canAddPlayers(){
        game.addPlayers(player1);
        game.addPlayers(player2);
        assertEquals(2, game.countPlayers());
    }

    @Test
    public void gameHasDealer(){
        Dealer dealer = game.getDealer();
        assert(dealer instanceof Dealer);
    }

    @Test
    public void canDealerDealCards(){
        game.addPlayers(player1);
        game.addPlayers(player2);
        game.dealerDealsCards(dealer, deck);
        assertEquals(1, player1.countCards());
    }

    @Test
    public void canHaveWinner() {
        game.addPlayers(player1);
        game.addPlayers(player2);
        player1.takesCard(new Card(SuitType.DIAMONDS, RankType.FOUR));
        player2.takesCard(new Card(SuitType.CLUBS, RankType.ACE));
        assertEquals(player1, game.determineWinner());
    }
    
}
