package tp2ex6;

public class Player extends Individual {
    private Wallet chips;
    private String name;
    private int Bet;

    public Player (String name, int money){
        this.name = name;
        this.chips = new Wallet(money);
    }

    //pas de seter de name car on ne change pas de nom en cours de game
    public String getName (){
        return this.name;
    }

    //pas de seter de chips car leur nombre est gere par la classe Wallet
    public int getChips (){
        return this.chips.getChips();
    }

    public int getBet() {
        return this.Bet;
    }

    public void setBet(int bet) {
        this.Bet = bet;
    }
}
