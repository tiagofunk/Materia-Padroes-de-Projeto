package utils;

import model.DiretorBuilderTime;
import model.abstrato.PecaTabuleiro;

public interface MontadorTabuleiro {
    
    public PecaTabuleiro[][] montar( DiretorBuilderTime dbt1, DiretorBuilderTime dbt2 );
}
