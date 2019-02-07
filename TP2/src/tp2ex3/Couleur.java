package tp2ex3;

import static java.lang.Integer.min;

public abstract class Couleur {

    protected int red;
    protected int green;
    protected int blue;
    
    private int cyan;
    private int magenta;
    private int jaune;
    private int noir;

    public void setRed(int r) {
        this.red = r;
    }

    public void setGreen(int g) {
        this.green = g;
    }

    public void setBlue(int b) {
        this.blue = b;
    }

    public int getRed() {
        return this.red;
    }

    public int getGreen() {
        return this.blue;
    }

    public int getBlue() {
        return this.blue;
    }

    public void printColor() {
        System.out.println("red : " + this.red + " green : " + this.green + " blue : " + this.blue);
    }
   
    public void rgbToCmjn (){
        setNoir(min(min(255 - red, 255 - green), 255 - blue));
        
        if(getNoir()!=255){
            setCyan((255 - red - getNoir()) / (255 - getNoir()));
            setMagenta((255 - green - getNoir()) / (255 - getNoir()));
            setJaune((255 - blue - getNoir()) / (255 - getNoir()));
        } else {
            setCyan(255 - red);
            setMagenta(255 - green);
            setJaune(255 - blue);
        }
    }
    
    public void cmjnToRgb(){
        
        if (getNoir()!=255){
            red = ((255-getCyan())*(255-getNoir())/255);
            green = ((255 - getMagenta())*(255-getNoir())/255);
            blue = ((255 - getJaune())*(255-getNoir())/255);
        } else {
            red = 255 - getCyan();
            green = 255 - getMagenta();
            blue = 255 - getJaune();
        }
        
    }

    /**
     * @return the cyan
     */
    public int getCyan() {
        return cyan;
    }

    /**
     * @param cyan the cyan to set
     */
    public void setCyan(int cyan) {
        this.cyan = cyan;
    }

    /**
     * @return the magenta
     */
    public int getMagenta() {
        return magenta;
    }

    /**
     * @param magenta the magenta to set
     */
    public void setMagenta(int magenta) {
        this.magenta = magenta;
    }

    /**
     * @return the jaune
     */
    public int getJaune() {
        return jaune;
    }

    /**
     * @param jaune the jaune to set
     */
    public void setJaune(int jaune) {
        this.jaune = jaune;
    }

    /**
     * @return the noir
     */
    public int getNoir() {
        return noir;
    }

    /**
     * @param noir the noir to set
     */
    public void setNoir(int noir) {
        this.noir = noir;
    }

}
