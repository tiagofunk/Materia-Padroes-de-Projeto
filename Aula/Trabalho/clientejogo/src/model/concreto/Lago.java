package model.concreto;

import model.Time;
import model.TipoPeca;
import model.abstrato.PecaTabuleiro;

public class Lago extends PecaTabuleiro{
    
    public Lago() {
        super( TipoPeca.AGUA, Time.NENHUM );
    }
    
}
