package tp2ex6;

public class Player extends Individual {
    private Wallet chips = new Wallet (0);
    private String name;
    private int bet;

    public Player (String name, int money){
        this.name = name;
        this.chips.setChips(money);
    }

    //pas de seter de name car on ne change pas de nom en cours de game
    public String getName (){
        return this.name;
    }

    //pas de seter de chips car leur nombre est gere par la classe Wallet
    public Wallet getChips (){
        return this.chips;
    }

    public int getBet() {
        return this.bet;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    public void dontPlay(){
        this.valueHand = 0;
    }
}
