package model.abstrato;

import java.util.ArrayList;
import java.util.List;
import model.ObservadorValidadorJogada;
import model.TipoAnimal;
import model.TipoPeca;
import model.TipoTime;
import utils.GravadorLogs;

public abstract class ItemTabuleiro implements Peca{
    
    private int x;
    private int y;
    
    protected TipoPeca tipoPeca;
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
    
    public void validarAtaque(ItemTabuleiro[] caminho, TipoTime time ){
        boolean resultado;
        
        if( caminho[0].possuiPecaMovimental() ){
            if( caminho[0].getPecaMovimentavel().getTime() == time){
                PecaMovimentavel origem = caminho[0].getPecaMovimentavel();
                PecaMovimentavel destino = caminho[ caminho.length - 1 ].getPecaMovimentavel();

//                resultado = origem.validarMovimento(caminho)
//                        && (!caminho[caminho.length - 1].possuiPecaMovimental()
//                        && caminho[caminho.length - 1].getTipoPeca() != TipoPeca.TOCA);
                TipoPeca tp1 = caminho[ caminho.length - 1 ].getTipoPeca();
                TipoTime tt1 = origem.getTime();
                TipoTime tt2 = null;
                if( caminho[ caminho.length - 1 ].getTipoPeca() == TipoPeca.TOCA ){
                    tt2 = ( (PecaTabuleiro) caminho[ caminho.length -1 ] ).getTime();
                }
                
                resultado = origem.validarMovimento(caminho)
                    && (caminho[ caminho.length -1 ].getTipoPeca() == TipoPeca.TOCA
                        && origem.getTime() != ( (PecaTabuleiro) caminho[ caminho.length -1 ] ).getTime()
                        // Pode pular para uma casa vazia. Desde que não seja a toca do seu próprio time.

                        || destino == null
                        && caminho[ caminho.length -1 ].getTipoPeca() != TipoPeca.TOCA
                        // Pode pular para uma casa vazia.

                        || destino != null
                        && origem.getTipo().getValor() > destino.getTipo().getValor()
                        && origem.getTime() != destino.getTime()
                        && origem.getTipo() != TipoAnimal.ELEFANTE
                        && destino.getTipo() != TipoAnimal.RATO
                        // Mata uma peça do time adverśario de menor valor,
                        // Com exceção do elefante para o rato.
                        
                        || destino != null
                        && origem.getTipo() == TipoAnimal.RATO
                        && destino.getTipo() == TipoAnimal.ELEFANTE
                        && origem.getTime() != destino.getTime()
                        && caminho[ 0 ].getTipoPeca() == caminho[ caminho.length - 1 ].getTipoPeca()
                        // Caso que o rato pode capturar um elefante do outro time.
                        // Mas apenas quando estão um mesmo tipo de terreno.
                        
                        || destino != null
                        && origem.getTime() != destino.getTime() 
                        && caminho[ caminho.length -1 ].getTipoPeca() == TipoPeca.ARMADILHA
                        && ( (PecaTabuleiro) caminho[ caminho.length -1 ] ).getTime() == origem.getTime()
                        // Caso aonde pode captura uma peça do time adverśario que esta
                        // em uma armadilha do seu time.
                        
                    );
                
                GravadorLogs.escrever(
                   "Origem: " + caminho[0] + "-" + origem +
                   ">>" + "Destino: " + caminho[caminho.length - 1] + "-"
                   + destino + ":" + resultado
                );
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

    @Override
    public String toString() {
        return tipoPeca + "";
    }
}
