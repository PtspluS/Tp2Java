package tp2ex6;

import java.util.ArrayList;

public class Round {
    private ArrayList<Player> players = new ArrayList<>();//car au vrai blackjack on peut jouer a plusieurs contre la banque
    private Bank bank;
    private int numRound;

    private int searchPlayerId(String name){//renvoie la position du joueur dans la liste
        int posPlayer = -1;
        for (Player p : players){
            if(p.getName()==name) {
                posPlayer = players.indexOf(p);
            }
        }
        return posPlayer;
    }

    private Player searchPlayer(String name){//renvoie le joueur
        for (Player p : players){
            if(p.getName()==name) {
               return players.get(players.indexOf(p));
            }
        }
        return null;
    }



    public int getNumRound() {
        return numRound;
    }

    public void setNumRound(int numRound) {
        this.numRound = numRound;
    }
}
