package model.abstrato;

import model.TipoAnimal;

public abstract class PecaNadadora extends PecaMovimentavel{
    
    public PecaNadadora(TipoAnimal tipo) {
        super(tipo);
    }
 
    @Override
    public boolean validarMovimento( ItemTabuleiro[] caminho){
        boolean resultado = true;
        if( caminho.length != 2 ){
            resultado = false;
        }else{
            resultado =
                caminho[ 0 ].ePecaAoLado( caminho[1].getX(), caminho[1].getY());
        }
        return resultado;
    }
}
