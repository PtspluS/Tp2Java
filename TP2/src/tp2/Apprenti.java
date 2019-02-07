package tp2;

public class Apprenti extends Etudiant {
    
    private Individu maitreApp = new Individu();
    
    public void setMaitre(Individu landa){
        this.maitreApp = landa;
    }
    
    public Individu getMaitre (){
        return this.maitreApp;
    }
    
    public void periodeEntreprise(){
        System.out.println("Je suis pas souvent en cours");
    }
    
    public Apprenti (int old, String name, Individu mds){
        this.age = old;
        this.nom = name;
        this.maitreApp = mds;
    }
}
