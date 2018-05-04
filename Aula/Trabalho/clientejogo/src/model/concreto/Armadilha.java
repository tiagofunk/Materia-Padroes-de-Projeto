package model.concreto;

import model.Time;
import model.TipoPeca;
import model.abstrato.PecaTabuleiro;

public class Armadilha extends PecaTabuleiro{
    
    public Armadilha(Time time) {
        super( TipoPeca.ARMADILHA, time );
    }

}
