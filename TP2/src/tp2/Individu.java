package tp2;

public class Individu {
    protected int age ;
    protected String nom;
    protected Ecole ecole;
    
    public void setAge (int a){
        this.age = a;
    }
    
    public int getAge (){
        return this.age;
    }
    
    public void setNom (String name){
        this.nom = name;
    }
    
    public String getName (){
        return this.nom;
    }
    
    public void setEcole (Ecole e){
        this.ecole = e;
    }
    
    public Ecole getEcole (){
        return this.ecole;
    }
}
