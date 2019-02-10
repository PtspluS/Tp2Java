package tp2ex2;

public class Chat extends Felin {
    private String nomProprio;


    public Chat (){

    }

    public Chat (double poids, double taille,String nom){
        this.setTaille(taille);
        this.setPoids(poids);
        this.nomProprio = nom;
    }

    public String getNomProprio() {
        return nomProprio;
    }

    public void setNomProprio(String nomProprio) {
        this.nomProprio = nomProprio;
    }

    public void printChat(){
        System.out.println("Le chat de "+this.nomProprio);
        System.out.print("Pese "+this.getPoids()+"kg");
        System.out.println(" et mesure "+this.getTaille()+"cm");

    }
}
