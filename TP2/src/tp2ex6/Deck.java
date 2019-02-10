package tp2ex6;

import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> deck = new ArrayList<>();

    public Deck (){
        for (Color c : Color.values()){
            for (Value v : Value.values()){
                //Card t = new Card(c,v);
                this.deck.add(new Card(c,v));
            }
        }

    }

    public ArrayList<Card> getDeck(){
        return this.deck;
    }

    public Card draw(){
        int rnd = (int) (Math.random() * (this.deck.size()));
        return this.deck.get(rnd);
    }
}
