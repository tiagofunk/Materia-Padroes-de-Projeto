package model.concreto;

import java.util.Map;
import model.DiretorBuilderTime;
import model.TipoTime;
import model.abstrato.BuilderTabuleiro;
import model.abstrato.ItemTabuleiro;
import model.abstrato.Peca;
import model.abstrato.PecaMovimentavel;
import model.abstrato.PecaTabuleiro;
import utils.Constantes;

public class BuilderTabuleiroConcreto extends BuilderTabuleiro{

    public BuilderTabuleiroConcreto( DiretorBuilderTime dbt1, DiretorBuilderTime dbt2 ) {
        super(dbt1, dbt2);
    }

    @Override
    public void construirTerreno(){
        ItemTabuleiro it;
        
        for( int i = 0; i < Constantes.ALTURA_TABULEIRO; i++ ){
            for( int j = 0; j < Constantes.LARGURA_TABULEIRO; j++ ){
                if( i >= 3 && i <= 5 && 
                    ( j == 1 || j == 2 || j== 4 || j == 5 )
                ){
                    it = new Lago();
                }else{
                    it = new Gramado();
                }
                it.setCoordenadas(i, j);
                tabuleiro[ i ][ j ] = it;
            }
        }
    }
    
    @Override
    public void construirPrimeiroTime(){
        Map<String, Peca> listaPeca = dbt1.getPecas();
        
        // Animais primeiro time.
        tabuleiro[0][0].setPecaMovimentavel( (PecaMovimentavel) listaPeca.get( Constantes.ID_LEAO ) );
        tabuleiro[0][6].setPecaMovimentavel( (PecaMovimentavel) listaPeca.get( Constantes.ID_TIGRE ));
        tabuleiro[1][1].setPecaMovimentavel( (PecaMovimentavel) listaPeca.get( Constantes.ID_LOBO ));
        tabuleiro[1][5].setPecaMovimentavel( (PecaMovimentavel) listaPeca.get( Constantes.ID_GATO ));
        tabuleiro[2][0].setPecaMovimentavel( (PecaMovimentavel) listaPeca.get( Constantes.ID_RATO ));
        tabuleiro[2][2].setPecaMovimentavel( (PecaMovimentavel) listaPeca.get( Constantes.ID_LEOPARDO ));
        tabuleiro[2][4].setPecaMovimentavel( (PecaMovimentavel) listaPeca.get( Constantes.ID_CACHORRO ));
        tabuleiro[2][6].setPecaMovimentavel( (PecaMovimentavel) listaPeca.get( Constantes.ID_ELEFANTE ));

        TipoTime time = tabuleiro[ 0 ][ 0 ].getPecaMovimentavel().getTime();
        
        // Armadilhas primeiro time
        Armadilha a = new Armadilha();
        a.setCoordenadas(0, 2);
        a.setTime(time);
        tabuleiro[0][2] = a;
        
        a = new Armadilha();
        a.setCoordenadas(1, 3);
        a.setTime(time);
        tabuleiro[1][3] = a;
        
        a = new Armadilha();
        a.setCoordenadas(0, 4);
        a.setTime(time);
        tabuleiro[0][4] = a;
        
        // Toca primeiro time
        tabuleiro[0][3] = (PecaTabuleiro) listaPeca.get( Constantes.ID_TOCA );
        tabuleiro[0][3].setCoordenadas(0, 3);
    }
    
    @Override
    public void construirSegundoTime(){
        Map<String, Peca> listaPeca = dbt2.getPecas();
        
        // Animais segundo time.
        tabuleiro[8][6].setPecaMovimentavel( (PecaMovimentavel) listaPeca.get( Constantes.ID_LEAO ));
        tabuleiro[8][0].setPecaMovimentavel( (PecaMovimentavel) listaPeca.get( Constantes.ID_TIGRE ));
        tabuleiro[7][5].setPecaMovimentavel( (PecaMovimentavel) listaPeca.get( Constantes.ID_LOBO ));
        tabuleiro[7][1].setPecaMovimentavel( (PecaMovimentavel) listaPeca.get( Constantes.ID_GATO ));
        tabuleiro[6][6].setPecaMovimentavel( (PecaMovimentavel) listaPeca.get( Constantes.ID_RATO ));
        tabuleiro[6][4].setPecaMovimentavel( (PecaMovimentavel) listaPeca.get( Constantes.ID_LEOPARDO ));
        tabuleiro[6][2].setPecaMovimentavel( (PecaMovimentavel) listaPeca.get( Constantes.ID_CACHORRO ));
        tabuleiro[6][0].setPecaMovimentavel( (PecaMovimentavel) listaPeca.get( Constantes.ID_ELEFANTE ));

        TipoTime time = tabuleiro[ 6 ][ 6 ].getPecaMovimentavel().getTime();
        
        // Armadilhas primeiro time
        Armadilha a = new Armadilha();
        a.setCoordenadas(8, 2);
        a.setTime(time);
        tabuleiro[8][2] = a;
        
        a = new Armadilha();
        a.setCoordenadas(7, 3);
        a.setTime(time);
        tabuleiro[7][3] = a;
        
        a = new Armadilha();
        a.setCoordenadas(8, 4);
        a.setTime(time);
        tabuleiro[8][4] = a;

        // Tocas segundo time
        tabuleiro[8][3] = (PecaTabuleiro) listaPeca.get( Constantes.ID_TOCA );
        tabuleiro[8][3].setCoordenadas(8, 3);
    }
}
