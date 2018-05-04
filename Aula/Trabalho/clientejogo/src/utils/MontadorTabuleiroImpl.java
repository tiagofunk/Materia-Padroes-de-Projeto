package utils;

import java.util.Map;
import model.DiretorBuilderTime;
import model.abstrato.Peca;
import model.abstrato.PecaMovimentavel;
import model.abstrato.PecaTabuleiro;
import model.concreto.Gramado;
import model.concreto.Lago;

public class MontadorTabuleiroImpl implements MontadorTabuleiro{

    @Override
    public PecaTabuleiro[][] montar(DiretorBuilderTime dbt1, DiretorBuilderTime dbt2) {
        final int ALTURA = 9;
        final int LARGURA = 7;
        PecaTabuleiro[][] tabuleiro = new PecaTabuleiro[ ALTURA ][ LARGURA ];
        
        for( int i = 0; i < ALTURA; i++ ){
            for( int j = 0; j < LARGURA; j++ ){
                tabuleiro[ i ][ j ] = new Gramado();
            }
        }
        
        //Primeiro time
        dbt1.construirTime();
        Map<String, Peca> listaPeca = dbt1.getPecas();

        // Lagos
        tabuleiro[3][1] = new Lago();
        tabuleiro[4][1] = new Lago();
        tabuleiro[5][1] = new Lago();
        tabuleiro[3][2] = new Lago();
        tabuleiro[4][2] = new Lago();
        tabuleiro[5][2] = new Lago();
        tabuleiro[3][4] = new Lago();
        tabuleiro[4][4] = new Lago();
        tabuleiro[5][4] = new Lago();
        tabuleiro[3][5] = new Lago();
        tabuleiro[4][5] = new Lago();
        tabuleiro[5][5] = new Lago();

        // Animais primeiro time.
        tabuleiro[0][0].setPecaMovimental( (PecaMovimentavel) listaPeca.get( "leao" ) );
        tabuleiro[0][6].setPecaMovimental( (PecaMovimentavel) listaPeca.get( "tigre" ));
        tabuleiro[1][1].setPecaMovimental( (PecaMovimentavel) listaPeca.get( "lobo" ));
        tabuleiro[1][5].setPecaMovimental( (PecaMovimentavel) listaPeca.get( "gato" ));
        tabuleiro[2][0].setPecaMovimental( (PecaMovimentavel) listaPeca.get( "rato" ));
        tabuleiro[2][2].setPecaMovimental( (PecaMovimentavel) listaPeca.get( "leopardo" ));
        tabuleiro[2][4].setPecaMovimental( (PecaMovimentavel) listaPeca.get( "cachorro" ));
        tabuleiro[2][6].setPecaMovimental( (PecaMovimentavel) listaPeca.get( "elefante" ));

        // Armadilhas primeiro time
        tabuleiro[0][2] = (PecaTabuleiro) listaPeca.get( "armadilha" );
        tabuleiro[1][3] = (PecaTabuleiro) listaPeca.get( "armadilha" );
        tabuleiro[0][4] = (PecaTabuleiro) listaPeca.get( "armadilha" );

        // Toca primeiro time
        tabuleiro[0][3] = (PecaTabuleiro) listaPeca.get( "toca" );

        // Segundo time.
        dbt2.construirTime();
        listaPeca = dbt2.getPecas();
        
        tabuleiro[8][6].setPecaMovimental( (PecaMovimentavel) listaPeca.get( "leao" ));
        tabuleiro[8][0].setPecaMovimental( (PecaMovimentavel) listaPeca.get( "tigre" ));
        tabuleiro[7][5].setPecaMovimental( (PecaMovimentavel) listaPeca.get( "lobo" ));
        tabuleiro[7][1].setPecaMovimental( (PecaMovimentavel) listaPeca.get( "gato" ));
        tabuleiro[6][6].setPecaMovimental( (PecaMovimentavel) listaPeca.get( "rato" ));
        tabuleiro[6][4].setPecaMovimental( (PecaMovimentavel) listaPeca.get( "leopardo" ));
        tabuleiro[6][2].setPecaMovimental( (PecaMovimentavel) listaPeca.get( "cachorro" ));
        tabuleiro[6][0].setPecaMovimental( (PecaMovimentavel) listaPeca.get( "elefante" ));

        // Armadilhas segueiro time
        tabuleiro[8][2] = (PecaTabuleiro) listaPeca.get( "armadilha" );
        tabuleiro[7][3] = (PecaTabuleiro) listaPeca.get( "armadilha" );
        tabuleiro[8][4] = (PecaTabuleiro) listaPeca.get( "armadilha" );

        // Tocas segundo time
        tabuleiro[8][3] = (PecaTabuleiro) listaPeca.get( "toca" );
        
        return tabuleiro;
    }
    
}
