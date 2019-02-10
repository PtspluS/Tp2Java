package tp2;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.reverseOrder;

public class Etudiant extends Individu{
            
    public ArrayList<Float> notes = new ArrayList<>();
    
    public void apprendre(){
        System.out.println("J'apprend bien mon cours");
    }
    
    public void triNoteC (){
        Collections.sort(this.notes);
    }
    
    public void triNoteD (){
        Collections.sort(this.notes, reverseOrder());
    }
    
}
