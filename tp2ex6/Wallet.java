package tp2ex6;

public class Wallet {
    private double chips;

    public Wallet (int money){
        this.chips = money;
    }

    public void win (double money){
        this.chips += money;
    }

    public void lose (double money){
        this.chips -= money;
    }

    public double getChips (){
        return this.chips;
    }
}
