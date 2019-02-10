package tp2ex6;

public enum Value {
    AS (11),
    TWO (2),
    THREE (3),
    FOUR (4),
    FIVE (5),
    SIX (6),
    SEVEN (7),
    HEIGHT (8),
    NINE (9),
    TEN (10),
    JACK (10),
    QUEEN(10),
    KING(10);

    private int value;

    Value (int val){
        this.value = val;
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int v){//ne sert qu'a reatribuer la valeur de l'as au cas ou il vaut 11 mais qu'on lui prefere 1
        this.value = v;
    }
}