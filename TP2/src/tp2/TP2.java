package tp2;

public class TP2 {

    public static void main(String[] args) {
       
       int antoineAge = 20;
       int martinAge = 21;
       int ihadadouAge = 35;
            
       Etudiant antoine = new Etudiant();
       Etudiant martin = new Etudiant() ;
       
       Enseignant ihadadou = new Enseignant();
       
       antoine.setAge(antoineAge);
       antoine.setNom("Deus");
       
       martin.setAge(martinAge);
       martin.setNom("La haut");
       
       ihadadou.setAge(ihadadouAge);
       ihadadou.setNom("Time Man");
    }
    
}
