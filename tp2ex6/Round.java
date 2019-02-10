package tp2ex6;

import java.util.ArrayList;
import java.util.Scanner;

public class Round {
    private ArrayList<Player> players = new ArrayList<>();//car au vrai blackjack on peut jouer a plusieurs contre la banque
    private Bank bank;
    private int numRound;//manche actuelle ex : round 1

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

    public Round (int numRound, ArrayList<Player> players){//si on joue a plusieurs
        this.numRound = numRound;
        this.players = players;
    }

    public Round (int numRound, Player p){//si on joue seul
        this.numRound = numRound;
        this.players.add(p);
    }

    public void playRound (){
        //on fait jouer la bank en premier pour donner la 1ere carte de la banque
        bank.draw();
        bank.printHand();

        for (Player p : players){//tour joueurs
            int bet = 0;
            String choise;
            Scanner sc = new Scanner(System.in);
            System.out.println("It's the turn of : "+p.getName());
            System.out.print("Bank hand value is equal to ");
            bank.printHand();
            System.out.println("How do you want to bet ?....You have "+p.getChips()+"$ yet (0 to skip)");
            bet = sc.nextInt();
            System.out.println("You bet : "+bet+"$");
            p.setBet(bet);
            if(bet != 0) {
                p.draw();
                p.draw();
                p.printHand();
                if(p.getValueHand() != 21) {
                    System.out.println("Do you want to draw a other card ? (y)es or (n)o");
                    choise = sc.nextLine();
                    while (choise != "n" && p.getValueHand() != 21) {
                        p.draw();
                        p.printHand();
                        System.out.println("Do you want to draw a other card ? (y)es or (n)o");
                        choise = sc.nextLine();
                    }
                    if (p.getValueHand()>21){
                        System.out.println("Overflow : you lose !");
                        p.getChips().lose(bet);
                    }
                } else {
                    System.out.println("Black jack !!!");
                    p.getChips().win(bet*1.5);
                }
            }
            else {
                p.dontPlay();
            }
        }
        //tour bank
        System.out.println("It's the turn of the bank ! Let's go !");
        while(bank.getValueHand()<16){
            bank.draw();
        }
        bank.printHand();

        /*parti IA
        La banque va scruter tous les joueurs pour voir si elle en bas assez sans devoir prendre le risque de retirer une carte supplementaire
        */
        int victoryOnPlayers = 0;
        for (Player p : players){
            if(p.getValueHand()>0 && p.getValueHand()<21 && p.getValueHand()<bank.getValueHand()){
                victoryOnPlayers++;
            }
        }
        if(victoryOnPlayers <0.5*players.size()){
            bank.draw();
            bank.printHand();
        }

        for (Player p : players){
            if (p.getValueHand()< bank.getValueHand()) {
                p.getChips().lose(p.getBet());
                if (p.getValueHand() <= 0) {
                    players.remove(p);
                    System.out.println(p.getName() + " a perdu");
                }
            }else {
                p.getChips().win(p.getBet());//on ne gagne qu'une fois la mise car on ne la perd pas de suite en la misant
            }
        }
    }

}
