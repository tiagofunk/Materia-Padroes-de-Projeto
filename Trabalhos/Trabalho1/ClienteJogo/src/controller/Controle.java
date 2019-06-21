package controller;

import server.ConexaoServidor;
import server.ObservadorServidor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Jogo;
import model.CommandPeca;
import model.CommandPecaConcreta;
import model.DiretorBuilderTime;
import model.ObservadorValidadorJogada;
import model.TipoTime;
import model.concreto.FabricaPecasConcreta;
import utils.Constantes;
import utils.LeitorConfiguracoes;
import utils.PreparadorMensagens;

public class Controle implements ObservadorServidor, ObservadorValidadorJogada{
    
    private Jogo jogo;
    private ConexaoServidor conexao;
    
    private int[] primeiroClique = null;
    private int[] segundoClique = null;
    
    private CommandPeca commandPeca;
    
    private List< ObservadorControle > listaObservadores = new ArrayList<>();
    
    public Controle() {
        int porta;
        String host;
        
//        host = JOptionPane.showInputDialog("host");
//        porta = Integer.parseInt( JOptionPane.showInputDialog("porta") );
        
        LeitorConfiguracoes lc = new LeitorConfiguracoes("conf.txt");
        host = lc.getHost();
        porta = lc.getPorta();
        
        conexao = ConexaoServidor.getInstance();
        conexao.setPropriedades(host, porta);
        try {
            conexao.abrirConexao();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        conexao.addObservador(this);
        Thread t = new Thread( conexao );
        t.start();
        for( ObservadorControle obs : listaObservadores ){
            obs.informarNomeTela( "Jogo Dou Shou Qi #" + porta );
        }
    }
    
    public void addObservador( ObservadorControle obs ){
        listaObservadores.add(obs);
    }
    
    public void removeObservador( ObservadorControle obs ){
        listaObservadores.remove(obs);
    }
    
    public void comunicar( String mensagem ){
        try {
            conexao.enviar( mensagem );
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
        }else if( !mensagem.equals("fim") ){
            prepararJogadaDeMensagem( mensagem );
        }
    }

    private void prepararJogo( String mensagem ) {
        /**
         * Por algum motivo, se eu não mandar ele esperar
         * ao iniciar o Jframe, as imagens não serão carregadas,
         * Deve ser um problema com as threads, fica para o
         * futuro eu arrumar esse problema.
         */
        try {
            Thread.sleep( 3000 );
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        String[] s = mensagem.split( ":" );
        DiretorBuilderTime dbtAMA = new DiretorBuilderTime( new FabricaPecasConcreta(), TipoTime.AMARELO );
        DiretorBuilderTime dbtAZU = new DiretorBuilderTime( new FabricaPecasConcreta(), TipoTime.AZUL );

        if(s[ 1 ].equals( "amarelo" ) ){
            jogo = new Jogo(dbtAZU, dbtAMA, TipoTime.AMARELO, this, true);
        }else{
            jogo = new Jogo(dbtAMA, dbtAZU, TipoTime.AZUL, this, false);
        }
        for( ObservadorControle obs : listaObservadores ){
            obs.prepararTela();
            if( !s[1].equals( "amarelo" ) ){
                obs.permitirJogada( false );
            }
        }
    }

    public void informarClique(int i, int j) {
        if( jogo.getVezJogar() ){
            for( ObservadorControle obs : listaObservadores ){
                obs.informarCasaClicada( i, j );
            }
            if( primeiroClique == null ){
                primeiroClique = new int[]{ i, j };
            }else{
                segundoClique = new int[]{ i, j };
                
                commandPeca = new CommandPecaConcreta();
                
                if( validarCliques() ){
//                    LeitorConfiguracoes.escrever( 
//                        PreparadorMensagens.getInstance().escreverJogada(primeiroClique, segundoClique)
//                    );
                    commandPeca.execute(jogo.getPecasClique( primeiroClique, segundoClique), jogo.getTipoTime() );
                    
                }else{
                    for( ObservadorControle obs : listaObservadores ){
                        obs.limparEnfase();
                        obs.informar( "Lembre-se: as peças apenas podem se mover na vertical ou na horizontal !!" );
                    }
                    resetarJogada();
                }
            }
        }else{
            for( ObservadorControle obs : listaObservadores ){
                obs.informar( "Ainda não é sua vez de jogar !!" );
                obs.limparEnfase();
            }
        }
    }
    
    private boolean validarCliques(){
        return primeiroClique[0] == segundoClique[0] || primeiroClique[1] == segundoClique[1];
    }
    
    private void inverterCoordenadasJogada(){
        primeiroClique[ 0 ] = Constantes.ALTURA_TABULEIRO - primeiroClique[ 0 ] - 1;
        segundoClique[ 0 ] = Constantes.ALTURA_TABULEIRO - segundoClique[ 0 ] - 1;
        
        primeiroClique[ 1 ] = Constantes.LARGURA_TABULEIRO - primeiroClique[ 1 ] - 1;
        segundoClique[ 1 ] = Constantes.LARGURA_TABULEIRO - segundoClique[ 1 ] - 1;
    }

    public void informarFechamento() {
        comunicar("fim");
    }
    
    private void prepararCasoJogadaValida(){
        jogo.realizarJogada( primeiroClique, segundoClique );
        jogo.alternarJogador();
        
        for( ObservadorControle obs : listaObservadores ){
            obs.prepararTela();
            obs.permitirJogada( false );
            obs.limparEnfase();
        }

        inverterCoordenadasJogada();
        comunicar(
            new PreparadorMensagens().escreverJogada(primeiroClique, segundoClique)
        );

        resetarJogada();
    }
    
    private void prepararCasoJogadaInvalida(){
        for( ObservadorControle obs : listaObservadores ){
            obs.informar( "Jogada inválida !!" );
            obs.limparEnfase();
        }
        resetarJogada();
    }

    @Override
    public void informarValidacao(boolean valido) {
        if( valido ){
            prepararCasoJogadaValida();
        }else{
            prepararCasoJogadaInvalida();
        }
    }
    
    private void resetarJogada(){
        primeiroClique = null;
        segundoClique = null;
    }

    private void prepararJogadaDeMensagem(String mensagem) {
        PreparadorMensagens pm = new PreparadorMensagens();
        pm.lerJogada(mensagem);
        
        jogo.realizarJogada( pm.getPrimeiraJogada(), pm.getSegundaJogada() );
        jogo.alternarJogador();
        for( ObservadorControle obs : listaObservadores ){
            obs.permitirJogada( true );
            obs.prepararTela();
        }
    }

    public void desfazerClique() {
        resetarJogada();
        for( ObservadorControle obs: listaObservadores ){
            obs.limparEnfase();
        }
    }

}
