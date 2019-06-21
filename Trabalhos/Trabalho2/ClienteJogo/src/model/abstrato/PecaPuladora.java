package model.abstrato;

import model.TipoAnimal;
import model.TipoPeca;

public abstract class PecaPuladora extends PecaMovimentavel{
    
    public PecaPuladora(TipoAnimal tipo) {
        super(tipo);
    }
    
    @Override
    public boolean validarMovimento( ItemTabuleiro[] caminho){
        boolean resultado;
        switch (caminho.length) {
            case 4:
                resultado =
                    ItemTabuleiro.estaoEmLinhaReta( caminho[1], caminho[2] )
                    && caminho[ 1 ].getTipoPeca() == TipoPeca.AGUA
                    && !caminho[ 1 ].possuiPecaMovimental()
                    && caminho[ 2 ].getTipoPeca() == TipoPeca.AGUA
                    && !caminho[ 2 ].possuiPecaMovimental()
                    && caminho[ 3 ].getTipoPeca() == TipoPeca.GRAMA;
                break;
            case 5:
                resultado =
                    ItemTabuleiro.estaoEmLinhaReta( caminho[1], caminho[2], caminho[3] )
                    && caminho[ 1 ].getTipoPeca() == TipoPeca.AGUA
                    && !caminho[ 1 ].possuiPecaMovimental()
                    && caminho[ 2 ].getTipoPeca() == TipoPeca.AGUA
                    && !caminho[ 2 ].possuiPecaMovimental()
                    && caminho[ 3 ].getTipoPeca() == TipoPeca.AGUA
                    && !caminho[ 3 ].possuiPecaMovimental()
                    && caminho[ 4 ].getTipoPeca() == TipoPeca.GRAMA;
                break;
            case 2:
                resultado =
                   caminho[ 0 ].ePecaAoLado( caminho[1].getX(), caminho[ 1 ].getY())
                   && caminho[ 1 ].getTipoPeca() != TipoPeca.AGUA;
                break;
            default:
                resultado = false;
                break;
        }
        return resultado;
    }
    
}
