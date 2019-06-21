package model;

import model.abstrato.BuilderTabuleiro;
import model.abstrato.ItemTabuleiro;

public class DiretorBuilderTabuleiro {
    
    private BuilderTabuleiro dt;

    public DiretorBuilderTabuleiro(BuilderTabuleiro dt) {
        this.dt = dt;
    }
    
    public void construirTabuleiro(){
        dt.construirTerreno();
        dt.construirPrimeiroTime();
        dt.construirSegundoTime();
    }
    
    public ItemTabuleiro[][] getTabuleiro(){
        return dt.getTabuleiro();
    }
}
