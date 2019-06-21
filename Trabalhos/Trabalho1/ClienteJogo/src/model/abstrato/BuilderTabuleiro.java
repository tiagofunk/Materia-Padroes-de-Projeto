package model.abstrato;

import model.DiretorBuilderTime;
import utils.Constantes;

public abstract class BuilderTabuleiro {
    
    protected DiretorBuilderTime dbt1;
    protected DiretorBuilderTime dbt2;
    
    protected ItemTabuleiro[][] tabuleiro;

    public BuilderTabuleiro(DiretorBuilderTime dbt1, DiretorBuilderTime dbt2) {
        this.dbt1 = dbt1;
        this.dbt2 = dbt2;
        this.dbt1.construirTime();
        this.dbt2.construirTime();
        tabuleiro = new ItemTabuleiro[Constantes.ALTURA_TABULEIRO ][ Constantes.LARGURA_TABULEIRO ];
    }
    
    public void construirTerreno(){
    }
    
    public void construirPrimeiroTime(){
    }
    
    public void construirSegundoTime(){
    }
    
    public ItemTabuleiro[][] getTabuleiro(){
        return tabuleiro;
    }
}
