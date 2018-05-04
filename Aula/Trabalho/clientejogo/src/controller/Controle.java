package controller;

import server.ConexaoServidor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.DiretorBuilderTime;
import model.concreto.FabricaPecasAmarelas;
import model.concreto.FabricaPecasAzul;
import view.ObservadorControle;

public class Controle implements ObservadorServidor{
    
    private Jogo jogo;
    private ConexaoServidor conexao;
    
    private int[] primeiroClique = null;
    private int[] segundoClique = null;
    
    private List< ObservadorControle > listaObservadores = new ArrayList<>();
    
    public void addObservador( ObservadorControle obs ){
        listaObservadores.add(obs);
    }
    public void removeObservador( ObservadorControle obs ){
        listaObservadores.remove(obs);
    }

    public Controle( String host, int porta) {
        conexao = new ConexaoServidor( host, porta );
        try {
            conexao.abrirConexao();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        conexao.addObservador(this);
        Thread t = new Thread( conexao );
        t.start();

    }
    
    public void comunicar( String mensagem ){
        try {
            conexao.enviar( mensagem );
            System.out.println( "comunicarAlgo: " + mensagem );
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String[][] getNomeImagens() {
        return jogo.getIndentificadores();
    }

    @Override
    public void encaminharMensagemRecebida(String mensagem) {
        if( mensagem.startsWith( "jogador:" ) ){
            prepararJogo( mensagem );
        }else{
            jogo.alternarJogador();
            for( ObservadorControle obs : listaObservadores ){
                obs.informar( "Recebi a jogada !!" );
            }
        }
    }

    private void prepararJogo( String mensagem ) {
        /**
         * Por algum motivo, se eu não mandar ele esperar
         * ao iniciar o Jframe, as imagens não serão carregadas,
         * Deve ser um problema com as threads, fica para no
         * futuro eu arrumar esse problema.
         */
        try {
            Thread.sleep( 3000 );
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        String[] s = mensagem.split( ":" );
        DiretorBuilderTime dbtAMA = new DiretorBuilderTime( new FabricaPecasAmarelas() );
        DiretorBuilderTime dbtAZU = new DiretorBuilderTime( new FabricaPecasAzul() );

        if(s[ 1 ].equals( "amarelo" ) ){
            jogo = new Jogo(dbtAZU, dbtAMA, true);
        }else{
            jogo = new Jogo(dbtAMA, dbtAZU, false);
        }
        for( ObservadorControle obs : listaObservadores ){
            obs.prepararTela();
        }
    }

    public void informarClique(int i, int j) {
        if( jogo.getVezJogar() ){
            if( primeiroClique == null ){
                primeiroClique = new int[]{ i, j };
            }else{
                segundoClique = new int[]{ i, j };
                
                if( jogo.validar( primeiroClique, segundoClique ) ){
                    for( ObservadorControle obs : listaObservadores ){
                        obs.prepararTela();
                    }
                    inverterCoordenadasJogada( primeiroClique, segundoClique );
                    comunicar(
                        primeiroClique[ 0 ] + "," + primeiroClique[ 1 ] + ";" +
                        segundoClique[ 0 ] + "," + segundoClique[ 1 ] + ";"
                    );
                    
                    primeiroClique = null;
                    segundoClique = null;
                    jogo.alternarJogador();
                    for( ObservadorControle obs : listaObservadores ){
                        obs.informar( "Jogada enviada !!" );
                    }
                }else{
                    for( ObservadorControle obs : listaObservadores ){
                        obs.informar( "Jogada inválida !!" );
                    }
                }
            }
        }else{
            for( ObservadorControle obs : listaObservadores ){
                obs.informar( "Ainda não é sua vez de jogar !!" );
            }
        }
    }
    
    private void inverterCoordenadasJogada( int[] i1, int[] i2 ){
        for( int i = 0; i < i1.length && i < i2.length; i++ ){
            i1[ i ] = Jogo.ALTURA - i1[ i ];
            i2[ i ] = Jogo.LARGURA - i2[ i ];
        }
    }

    public void informarFechamento() {
        comunicar("fim");
    }

}
