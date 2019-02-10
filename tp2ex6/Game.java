package tp2ex6;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private ArrayList <Player> players;
    private Round run;
    private int playersNumber = 0;

    private void initiateGamePlayers (int money){
        Scanner sc = new Scanner(System.in);
        String name;

        System.out.println("How many players do you want ? ");
        this.playersNumber = (int) sc.nextDouble();
        for (int i = 0 ; i<playersNumber;i++){
            System.out.print("Your name is : ");
            name = sc.next();
            Player p = new Player(name,money);
            players.add(p);
        }
    }

    public Game (){//la somme qu'on donne à chaque joueur en debut de game
        Scanner sc = new Scanner(System.in);

    }
}
