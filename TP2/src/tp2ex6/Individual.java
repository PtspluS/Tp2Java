package tp2ex6;

import java.util.ArrayList;

public abstract class Individual {
    private ArrayList<Card> hand = new ArrayList<>();
    protected int valueHand;


    public int getValueHand (){
        return this.valueHand;
    }

    public void addCard (Card card){
        Value newCardValue = card.getValue();
        if(newCardValue.getValue() == 11 && this.valueHand >= 21){
            newCardValue.setValue(1);
            card.setValue(newCardValue);
        }
        this.hand.add(card);
        this.valueHand += card.getValue().getValue();//je sais, c'est moche mais ça me rapelle mon js <3
    }

    public void printHand (){
        int i = 0;
        for (Card c : this.hand){
            i++;
            System.out.print(i+"eme card : ");
            c.printCard();
        }
        System.out.println("Your hand : "+this.valueHand);
    }

    public Card draw(){
        Deck deck = new Deck();
        Card card = deck.draw();
        this.addCard(card);
        return card;
    }

    public void clearHand(){
        this.hand.clear();
        this.valueHand = 0;
    }
}
