package model.chines;

import model.abstracto.Minerador;

public class MineradorChines implements Minerador{

    private double taxaMineracao = 0.198019802;
    
    @Override
    public double minerar() {
        taxaMineracao += taxaMineracao * 0.01;
        return taxaMineracao;
    }
    
}
