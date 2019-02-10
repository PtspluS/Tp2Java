package tp2ex6;

public class Card {
    
    private Value value;
    private Color color;
            
    public Card (Color c, Value v){
        this.color = c;
        this.value = v;
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

    public void printCard (){
        System.out.println("Color : "+this.color+" | "+this.value+" => "+this.value.getValue());
    }
}
