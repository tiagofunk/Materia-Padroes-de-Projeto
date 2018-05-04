package server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import model.ObservadorCliente;

public class ConexaoCliente implements Runnable{
    
    private int jogador;
    private int porta;
    private Socket socket;
    private ServerSocket serverSocket;
    private ObjectInputStream input;
    private ObjectOutputStream output;
    
    private List< ObservadorCliente > listaObservadores = new ArrayList<>();
    
    public void addObservador( ObservadorCliente obs ){
        listaObservadores.add( obs );
    }
    
    public void removeObservador( ObservadorCliente obs ){
        listaObservadores.remove( obs );
    }

    public ConexaoCliente(int porta, int jogador) {
        this.porta = porta;
        this.jogador = jogador;
    }
    
    public void iniciarConexao() throws IOException{
        System.out.println("Esperando conexao na porta " + porta + "..." );
        serverSocket = new ServerSocket( porta );
        socket = serverSocket.accept();
        
        output = new ObjectOutputStream( socket.getOutputStream() );
        input = new ObjectInputStream( socket.getInputStream() );
        
        System.out.println("Conexão estabelecida no porta " + porta + ".");
        
    }
    
    public void enviar( String mensagem ) throws IOException{
        output.writeUTF(mensagem);
        output.flush();
        System.out.println("enviando: " + mensagem );
    }

    @Override
    public void run() {
        String mensagem = "";
        while( true ){
            try {
                mensagem = input.readUTF();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            try {
                Thread.sleep( 100 );
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            if( mensagem != null && !mensagem.isEmpty() ){
                System.out.println("Porta: " + porta + "Mensagem: " + mensagem );
                int destino = 0;
                if( jogador == 1 ){
                    destino = 2;
                }else if( jogador == 2 ){
                    destino = 1;
                }
                for( ObservadorCliente oc : listaObservadores ){
                    oc.informar(mensagem, destino);
                }
                if( mensagem.equals( "fim" ) ){
                    break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "ConexaoCliente{" + "jogador=" + jogador + ", porta=" + porta + '}';
    }
    
}
