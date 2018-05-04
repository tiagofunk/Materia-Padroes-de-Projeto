package model.abstrato;

import model.Time;
import model.TipoAnimal;

public abstract class PecaMovimentavel implements Peca{
    
    private Time time;
    private TipoAnimal tipo;

    public PecaMovimentavel(Time time, TipoAnimal tipo) {
        this.time = time;
        this.tipo = tipo;
    }

    public Time getTime() {
        return time;
    }

    public TipoAnimal getTipo() {
        return tipo;
    }
    
    public abstract boolean validarMovimento( int x, int y, PecaTabuleiro[] itensCaminho);
    
}
