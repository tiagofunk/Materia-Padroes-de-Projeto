package model.abstrato;

import model.TipoTime;
import model.TipoAnimal;

public abstract class PecaMovimentavel implements Peca{
    
    private TipoTime time;
    private TipoAnimal tipo;

    public PecaMovimentavel(TipoAnimal tipo) {
        this.tipo = tipo;
    }

    public void setTime( TipoTime time ){
        this.time = time;
    }
    
    public TipoTime getTime() {
        return time;
    }

    public TipoAnimal getTipo() {
        return tipo;
    }
    
    public abstract boolean validarMovimento( ItemTabuleiro[] caminho);
    
}
