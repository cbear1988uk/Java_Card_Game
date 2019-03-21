import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private Dealer dealer;

    public Game(){
        players = new ArrayList<Player>();
        dealer = new Dealer();
    }

    public void addPlayers(Player player) {
        this.players.add(player);
    }

    public int countPlayers() {
        return this.players.size();
    }

    public Dealer getDealer() {
        return this.dealer;
    }

    public void dealerDealsCards(Dealer dealer, Deck deck) {
        for(Player player : players){
            Card card = dealer.dealCard(deck);
            player.takesCard(card);
        }
        dealer.dealCard(deck);
    }

    public Player determineWinner() {
        Player winner = players.get(0);
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).cardValue() > winner.cardValue()) {
                winner = players.get(i);
            }
        }
        return winner;
    }


}
