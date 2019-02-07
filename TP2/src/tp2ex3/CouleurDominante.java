package tp2ex3;
//Couleur avec une certaine pointe

import static java.lang.Math.abs;


public class CouleurDominante extends Couleur {

    public CouleurDominante(int r, int g, int b) {
         if(abs(r-g)>=125 || abs(r-b)>=125 || abs(b-g)>=125){
            this.red = r;
            this.green = g;
            this.blue = b;
        }else {
            System.out.println("error : cette couleur n'a pas de dominante");
        }
    }
}
