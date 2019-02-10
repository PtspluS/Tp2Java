package tp2ex2;

public class Animal {
    private double taille;
    private double poids;

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public void manger (Animal a){
        if(a instanceof Chat){
            System.out.println("Je mange des croquettes");
        }
        else if (a instanceof Puma || a instanceof Tigre){
            System.out.println("Je mange un elan");
        }

    }
    public void dormir (Animal a){
        if(a instanceof Chat || a instanceof Tigre){
            System.out.println("Je dors en boule");
        }
        else if (a instanceof Puma){
            System.out.println("Je dors etalle");
        }
    }
}
