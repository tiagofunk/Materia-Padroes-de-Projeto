package model.concreto;

import model.Time;
import model.TipoAnimal;
import model.abstrato.PecaTabuleiro;
import model.abstrato.PecaMovimentavel;

public class Elefante extends PecaMovimentavel{

    public Elefante(Time time) {
        super(time, TipoAnimal.ELEFANTE);
    }

    @Override
    public boolean validarMovimento(int x, int y, PecaTabuleiro[] itensCaminho) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
