package tp2ex5;

public abstract class Nombre {
    private int intpart;
    private int floatpart;

    public abstract Nombre addition(Nombre x, Nombre y);

    public abstract Nombre soustraction(Nombre x, Nombre y);

    public abstract Nombre multiplication(Nombre x, Nombre y);

    public abstract Nombre division(Nombre x, Nombre y);

    public int getIntpart() {
        return intpart;
    }

    public void setIntpart(int intpart) {
        this.intpart = intpart;
    }

    public int getFloatpart() {
        return floatpart;
    }

    public void setFloatpart(int floatpart) {
        this.floatpart = floatpart;
    }
}
