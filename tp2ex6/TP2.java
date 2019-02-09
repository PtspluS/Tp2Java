
package tp2ex6;

public class TP2 {
    public static void main(String[] args) {
        Color color = null;
        Value val ;
        Card c = new Card(color.COEUR,Value.valueOf("AS"));
        Deck deck = new Deck();
        c = deck.draw();
     }
}
