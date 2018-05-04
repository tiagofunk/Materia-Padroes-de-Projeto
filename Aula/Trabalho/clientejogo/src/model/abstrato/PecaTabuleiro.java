package model.abstrato;

import model.Time;
import model.TipoPeca;

public abstract class PecaTabuleiro implements Peca{
    
    private TipoPeca tipoPeca;
    private Time time;
    private PecaMovimentavel pecaMovimentavel;
    
    public PecaTabuleiro(TipoPeca tipoPeca, Time time) {
        this.tipoPeca = tipoPeca;
        this.time = time;
        pecaMovimentavel = null;
    }

    public TipoPeca getTipoPeca() {
        return tipoPeca;
    }
    
    public Time getTime() {
        return time;
    }

    public void setPecaMovimental( PecaMovimentavel pecaMovimentavel){
        this.pecaMovimentavel = pecaMovimentavel;
    }
    
    public PecaMovimentavel getPecaMovimentavel(){
        return pecaMovimentavel;
    }
}
