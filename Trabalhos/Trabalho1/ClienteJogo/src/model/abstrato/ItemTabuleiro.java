package model.abstrato;

import java.util.ArrayList;
import java.util.List;
import model.ObservadorValidadorJogada;
import model.TipoPeca;
import model.TipoTime;

public abstract class ItemTabuleiro implements Peca{
    
    private int x;
    private int y;
    
    private TipoPeca tipoPeca;
    private PecaMovimentavel pecaMovimentavel;
    
    private List<ObservadorValidadorJogada> listaObservadores = new ArrayList<>();

    public ItemTabuleiro(TipoPeca tipoPeca) {
        this.x = -1;
        this.y = -1;
        this.tipoPeca = tipoPeca;
        this.pecaMovimentavel = null;
    }
    
    public void addObservador( ObservadorValidadorJogada obs ){
        listaObservadores.add( obs );
    }
    
    public void removeObservador( ObservadorValidadorJogada obs ){
        listaObservadores.remove( obs );
    }

    public TipoPeca getTipoPeca() {
        return tipoPeca;
    }
    public PecaMovimentavel getPecaMovimentavel() {
        return pecaMovimentavel;
    }

    public void setPecaMovimentavel(PecaMovimentavel pecaMovimentavel) {
        this.pecaMovimentavel = pecaMovimentavel;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setCoordenadas(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public boolean possuiPecaMovimental(){
        return pecaMovimentavel != null;
    }
    
    public boolean ePecaAoLado( int x, int y ){
        boolean resultado = ( (this.x == x-1 || this.x == x+1) && this.y == y) 
                || ( (this.y == y-1 || this.y == y+1) && this.x == x );
        return resultado;
    }
    
    public static boolean estaoEmLinhaReta( ItemTabuleiro... pecas ){
        boolean resultado;
        if( pecas == null || pecas.length == 0 || pecas.length == 1){
            resultado = false;
        }else {
            boolean alinhadosX = true, alinhadosY = true;
            int x = pecas[ 0 ].getX(), y = pecas[ 0 ].getY();
            for( int i = 0; i < pecas.length && (alinhadosX || alinhadosY); i++ ){
                alinhadosX = alinhadosX && x == pecas[ i ].getX();
                alinhadosY = alinhadosY && y == pecas[ i ].getY();
            }
            resultado = alinhadosX ^ alinhadosY;
        }
        return resultado;
    }
    
    public void validarAtaque(ItemTabuleiro[] caminho, TipoTime tipo ){
        boolean resultado;
        
        if( caminho[0].possuiPecaMovimental() ){
            if( caminho[0].getPecaMovimentavel().getTime() == tipo){
                PecaMovimentavel origem = caminho[0].getPecaMovimentavel();

                resultado = origem.validarMovimento(caminho)
                        && (!caminho[caminho.length - 1].possuiPecaMovimental()
                        && caminho[caminho.length - 1].getTipoPeca() != TipoPeca.TOCA);
            }else{
                resultado = false;
            }
        }else{
            resultado = false;
        }
        
        for( ObservadorValidadorJogada obs: listaObservadores ){
            obs.informarValidacao( resultado );
        }
    }
}
