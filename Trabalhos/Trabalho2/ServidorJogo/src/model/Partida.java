
package model;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import server.ConexaoCliente;

public class Partida implements ObservadorCliente{
    
    public static boolean primeiroJogador = true;
    Map< Integer, ConexaoCliente> conexoes = new HashMap<>();

    public Partida( int porta1, int porta2) throws IOException {
        conexoes.put( 1, new ConexaoCliente( porta1, 1 ) );
        conexoes.put( 2, new ConexaoCliente( porta2, 2 ) );
        
        conexoes.get( 1 ).addObservador( this );
        conexoes.get( 2 ).addObservador( this );
    }

    @Override
    public void informar(String mensagem, int destino) {
        try {
            conexoes.get( destino ).enviar( mensagem );
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void iniciarPatida() throws IOException {
        
        for( int i : conexoes.keySet() ){
            conexoes.get( i ).iniciarConexao();
            if( primeiroJogador ){
                conexoes.get( i ).enviar("jogador:amarelo");
                primeiroJogador = false;
            }else {
                conexoes.get( i ).enviar("jogador:azul");
            }
        }
        
        Thread t1 = new Thread( conexoes.get( 1 ) );
        t1.start();
        
        Thread t2 = new Thread( conexoes.get( 2 ) );
        t2.start();
    }


    
}
