package model.egipcio;

import model.abstracto.Lenhador;

public class LenhadorEgipcio implements Lenhador{
    
    private double taxaLenha = 0.495049505; 

    @Override
    public double fazerLenha() {
        taxaLenha += taxaLenha * 0.01;
        return taxaLenha;
    }
    
}
