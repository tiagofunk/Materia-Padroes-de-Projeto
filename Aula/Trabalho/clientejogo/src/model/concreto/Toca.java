package model.concreto;

import model.Time;
import model.TipoPeca;
import model.abstrato.PecaTabuleiro;

public class Toca extends PecaTabuleiro{
    
    public Toca(Time time) {
        super( TipoPeca.TOCA, time);
    }

}
