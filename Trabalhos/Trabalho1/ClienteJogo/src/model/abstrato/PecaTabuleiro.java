package model.abstrato;

import model.TipoTime;
import model.TipoPeca;

public abstract class PecaTabuleiro extends ItemTabuleiro{
    
    private TipoTime time;
    
    public PecaTabuleiro(TipoPeca tipoPeca) {
        super(tipoPeca);
    }
    
    public void setTime(TipoTime time){
        this.time = time;
    }

    public TipoTime getTime() {
        return time;
    }
}
