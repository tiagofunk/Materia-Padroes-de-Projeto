package model.concreto;

import model.Time;
import model.TipoPeca;
import model.abstrato.PecaTabuleiro;

public class Gramado extends PecaTabuleiro{
    
    public Gramado() {
        super( TipoPeca.GRAMA, Time.NENHUM );
    }
    
}
