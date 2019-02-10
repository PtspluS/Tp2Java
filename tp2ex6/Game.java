package tp2ex6;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private ArrayList <Player> players = new ArrayList<>();
    private Round run = new Round();
    private int playersNumber = 0;

    private void initiateGamePlayers (int money){
        Scanner sc = new Scanner(System.in);
        String name;

        System.out.println("How many players do you want ? ");
        this.playersNumber = (int) sc.nextDouble();
        sc.nextLine();
        for (int i = 0 ; i<playersNumber;i++){
            System.out.print("Your name is : ");
            name = sc.nextLine();
            players.add(new Player(name,money));
        }
    }

    public Game (){//chaque joueur met combien il veut avoir au total a miser
        Scanner sc = new Scanner(System.in);
        int wallet = 0;//porte feuille de depart

        initiateGamePlayers(wallet);

        for (Player p : players){
            System.out.println("How much in your wallet ? ");
            wallet = (int) sc.nextDouble();
            p.getChips().setChips(wallet);
        }

    }

    public Game (int money){//chaque joueur a le meme porte feuille
        initiateGamePlayers(money);
    }

    public void playGame (){
        Scanner sc = new Scanner(System.in);
        String choise;
        do {
            ArrayList <Player> playersbis = this.players;
            for (Player p : playersbis) {
                System.out.println(p.getName()+" do you want to continue ? (y)es or (n)o");
                choise = sc.nextLine();
                if (choise.equals("n")){
                    playersbis.remove(p);
                }
            }
            if(playersbis.size() > 0) {
                this.players = playersbis;
                this.run = new Round(0, this.players);
                this.players = run.playRound();
            }

        } while (this.players.size() > 0);//tant que personne ne rage quit ou perd toute son argent le jeu continue
        System.out.println("Game is over");
    }
}
