package model;

import java.util.ArrayList;
import java.util.List;
import model.abstrato.ItemTabuleiro;
import model.abstrato.Peca;
import model.abstrato.PecaMovimentavel;
import model.concreto.BuilderTabuleiroConcreto;
import utils.Constantes;

public class Jogo {

    private boolean vezJogar = true;
    private boolean houveVencedor = false;
    private TipoTime time;

    private ItemTabuleiro[][] tabuleiro;

    public Jogo(DiretorBuilderTime dbt1, DiretorBuilderTime dbt2, 
            TipoTime time, ObservadorValidadorJogada obs, boolean vezJogar) {
        
        this.time = time;
        DiretorBuilderTabuleiro dbt 
                = new DiretorBuilderTabuleiro( new BuilderTabuleiroConcreto(dbt1, dbt2) );
        dbt.construirTabuleiro();
        tabuleiro = dbt.getTabuleiro();
        for( int i = 0; i < Constantes.ALTURA_TABULEIRO; i++ ){
            for( int j = 0; j < Constantes.LARGURA_TABULEIRO; j++){
                tabuleiro[ i ][ j ].addObservador(obs);
            }
        }
        this.vezJogar = vezJogar;
    }
    
    public static void imprimirTabuleiro( Peca[][] tabuleiro) {
        Peca p;
        for (int i = 0; i < Constantes.ALTURA_TABULEIRO; i++) {
            for (int j = 0; j < Constantes.LARGURA_TABULEIRO; j++) {
                p = tabuleiro[i][j];
                if (p != null) {
                    System.out.print("I: " + i + ", J: " + j + ", " + p.toString());
                } else {
                    System.out.print("I: " + i + ", J: " + j + "null");
                }
                System.out.print("    ");
            }
            System.out.println("\n");
        }
    }

    public String[][] getIndentificadores() {
        String s;
        ItemTabuleiro it;
        PecaMovimentavel pm;
        String[][] id = new String[ Constantes.ALTURA_TABULEIRO ][ Constantes.LARGURA_TABULEIRO ];
        for( int i = 0; i < Constantes.ALTURA_TABULEIRO; i++ ){
            for( int j = 0; j < Constantes.LARGURA_TABULEIRO; j++ ){
                it = tabuleiro[ i ][ j ];
                pm = it.getPecaMovimentavel();
                s = it.getTipoPeca().getNome();
                if( pm != null ){
                    s += "_" + pm.getTipo().getNome() + "_" + pm.getTime().getNome();
                }
                id[ i ][ j ] = s;
            }
        }
        return id;
    }

    public boolean getVezJogar() {
        return vezJogar;
    }

    public void alternarJogador() {
        vezJogar = !vezJogar;
    }

    public ItemTabuleiro[] getPecasClique(int[] primeiroClique, int[] segundoClique) {
        int x1, y1, x2, y2;
        List<ItemTabuleiro> pecas = new ArrayList<>();
        
        x1 = primeiroClique[0];
        y1 = primeiroClique[1];
        x2 = segundoClique[0];
        y2 = segundoClique[1];
        
        if( x1 == x2 ){
            if( y1 > y2){
                for( int i = y1; i >= y2; i-- ){
                    pecas.add( tabuleiro[ x1 ][ i ] );
                }
            }else{
                for( int i = y1; i <= y2; i++ ){
                    pecas.add( tabuleiro[ x1 ][ i ] );
                }
            }
            
        }else{
            if( x1 > x2 ){
                for( int i = x1; i >= x2; i-- ){
                    pecas.add( tabuleiro[ i ][ y1 ] );
                }
            }else{
                for( int i = x1; i <= x2; i++ ){
                    pecas.add( tabuleiro[ i ][ y1 ] );
                }
            }
        }
        
        ItemTabuleiro[] retorno = new ItemTabuleiro[ pecas.size() ];
        for( int i = 0; i < pecas.size(); i++ ){
            retorno[ i ] = pecas.get( i );
        }
        
        return retorno;
    }

    public void realizarJogada(int[] primeiroClique, int[] segundoClique) {
        PecaMovimentavel pm;
        pm = tabuleiro[ primeiroClique[0] ][ primeiroClique[1] ].getPecaMovimentavel();
        tabuleiro[ primeiroClique[0] ][ primeiroClique[1] ].setPecaMovimentavel( null );
        tabuleiro[ segundoClique[0] ][segundoClique[1] ].setPecaMovimentavel( pm );
    }
    
    public TipoTime getTipoTime(){
        return time;
    }
    
}
