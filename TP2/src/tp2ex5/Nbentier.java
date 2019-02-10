package tp2ex5;

public class Nbentier extends Nombre {

    public Nombre addition(Nombre x, Nombre y) {
        x.setIntpart(x.getIntpart() + y.getIntpart());
        return x;
    }

    public Nombre soustraction(Nombre x, Nombre y) {
        x.setIntpart(x.getIntpart() - y.getIntpart());
        return x;
    }

    public Nombre multiplication(Nombre x, Nombre y) {
        x.setIntpart(x.getIntpart() * y.getIntpart());
        return x;
    }

    public Nombre division(Nombre x, Nombre y) {
        x.setIntpart(x.getIntpart() / y.getIntpart());
        return x;
    }

}
