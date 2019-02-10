package tp2ex5;

public class NBflottant extends Nombre {
    public Nombre addition(Nombre x, Nombre y) {
        int carry = 0;
        carry = x.getFloatpart() + y.getFloatpart() / 10;
        x.setFloatpart(x.getFloatpart() + y.getFloatpart() - carry);
        x.setIntpart(x.getIntpart() + y.getIntpart() + carry);
        return x;
    }

    public Nombre soustraction(Nombre x, Nombre y) {
        int carry = 0;
        if (x.getFloatpart() - y.getFloatpart() < 0) {
            x.setFloatpart(y.getFloatpart() - x.getFloatpart());
            carry++;
        }
        x.setIntpart(x.getIntpart() - y.getIntpart() - carry);

        return x;
    }

    public Nombre multiplication(Nombre x, Nombre y) {
        int carry = 0;
        carry = x.getFloatpart() + y.getFloatpart() / 10;
        x.setFloatpart(x.getFloatpart() * y.getFloatpart() - carry);
        x.setIntpart(x.getIntpart() * y.getIntpart() + carry);
        return x;
    }

    public Nombre division(Nombre x, Nombre y) {

        x.setFloatpart(x.getFloatpart() / y.getFloatpart());
        x.setIntpart(x.getIntpart() / y.getIntpart());
        return x;
    }
}
