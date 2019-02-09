package tp2ex6;

public class Card {
    
    private Value value;
    private Color color;
            
    public Card (Color c, Value v){
        this.setColor(c);
        this.setValue(v);
    }


    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}