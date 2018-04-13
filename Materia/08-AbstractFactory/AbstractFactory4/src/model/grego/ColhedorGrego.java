package model.grego;

import model.abstracto.Colhedor;

public class ColhedorGrego implements Colhedor{

    private double taxaColheita = 0.99009901;
    
    @Override
    public double colher() {
        taxaColheita += taxaColheita * 0.01;
        return taxaColheita;
    }
    
}
