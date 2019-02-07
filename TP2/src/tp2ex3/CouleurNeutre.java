package tp2ex3;

import static java.lang.Math.abs;

/*Couleur Neutre est la couleur lambda et donc n'a pas de dominante*/
public class CouleurNeutre extends Couleur {

    public CouleurNeutre(int r, int g, int b) {
        if(abs(r-g)<=100 && abs(r-b)<=100 && abs(b-g)<=100){
            this.red = r;
            this.green = g;
            this.blue = b;
        }else {
            System.out.println("error : cette couleur a une dominante");
        }
    }
}
