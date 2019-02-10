package tp2ex2;

public class TP2 {
    public static void main(String[] args) {
        Chat myCat = new Chat();
        myCat.setNomProprio("moi");
        myCat.setPoids(10);
        myCat.setTaille(40);
        myCat.printChat();
        myCat.manger(myCat);
    }
}
