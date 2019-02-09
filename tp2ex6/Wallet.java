package tp2ex6;

public class Wallet {
    private int chips;

    public Wallet (int money){
        this.chips = money;
    }

    public void win (int money){
        this.chips += money;
    }

    public void lose (int money){
        this.chips -= money;
    }

    public int getChips (){
        return this.chips;
    }
}
