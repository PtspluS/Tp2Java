package tp2;

import java.util.ArrayList;

public class Enseignant extends Individu {
    public void enseigner(){
        System.out.println("J'enseigne comme un dieu");
    }
    
    public void setNote (Etudiant bili, float note){
        bili.notes.add(note);
    }
    
    public ArrayList<Float> getAllNote (Etudiant bili){
        return bili.notes;
    }
    
}
