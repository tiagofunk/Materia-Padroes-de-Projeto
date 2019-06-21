package model.abstrato;

import model.TipoAnimal;
import model.TipoPeca;

public abstract class PecaCaminhadora extends PecaMovimentavel{
    
    public PecaCaminhadora(TipoAnimal tipo) {
        super(tipo);
    }
    
    @Override
    public boolean validarMovimento( ItemTabuleiro[] caminho){
        boolean resultado;
        if( caminho.length != 2 ){
            resultado = false;
        }else{
            resultado =
                caminho[ 0 ].ePecaAoLado( caminho[1].getX(), caminho[1].getY())
                && caminho[ 1 ].getTipoPeca() != TipoPeca.AGUA;
        }
        return resultado;
    }
}
