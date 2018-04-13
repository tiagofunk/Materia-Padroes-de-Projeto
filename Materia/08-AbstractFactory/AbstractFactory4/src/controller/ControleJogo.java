package controller;

import java.util.ArrayList;
import java.util.List;
import model.abstracto.Colhedor;
import model.abstracto.FabricaTrabalhadores;
import model.abstracto.Lenhador;
import model.abstracto.Minerador;
import model.chines.FabricaChinesa;
import model.egipcio.FabricaEgipcia;
import model.grego.FabricaGrega;

public class ControleJogo {

    private int round = 0;
    
    private double dinheiro = 50.0;

    private FabricaTrabalhadores fabrica;
    private List< Colhedor > listaColhedores = new ArrayList<>();
    private List< Lenhador > listaLenhadores = new ArrayList<>();
    private List< Minerador > listaMineradores = new ArrayList<>();

    private List< Observador> listaObservadores = new ArrayList<>();

    public void addObservador(Observador obs) {
        listaObservadores.add(obs);
    }
    
    private String adicionarPassoSimulacao(){
        String s = "Round " + ++round + "\n";
        
        double valor = 0.0;
        for( Colhedor c : listaColhedores ){
            valor += c.colher();
        }
        s += "Colheu " + String.format("%.2f", valor) + " maçãs.\n";
        
        valor = 0.0;
        for( Lenhador l : listaLenhadores ){
            valor += l.fazerLenha();
        }
        s += "Gerou " + String.format("%.2f", valor) + " lenhas.\n";
        
        valor = 0.0;
        for( Lenhador l : listaLenhadores ){
            valor += l.fazerLenha();
        }
        s += "Minerou " + String.format("%.2f", valor) + " pedras.\n";
        
        s += "\n\n";
        return s;
    }

    public void executar() {
        Thread jogo = new Thread() {
            @Override
            public void run() {
                while ( round < 16 ) {
                     try {
                        Thread.sleep( 1000 );
                        
                        for( Observador obs : listaObservadores ){
                            obs.adicionarFeedBack( adicionarPassoSimulacao(), round, dinheiro );
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        jogo.start();
    }

    public void adicionarColhedor() {
        listaColhedores.add( fabrica.criarColhedor() );
    }

    public void adicionarLenhador() {
        listaLenhadores.add( fabrica.criarLenhador() );
    }

    public void adicionarMinerador() {
        listaMineradores.add( fabrica.criarMinerador() );
    }

    public void iniciar() {
        executar();
        fabrica = null;
    }

    public void escolher( String s) {
        if( s.equalsIgnoreCase( "g" ) ){
            fabrica = new FabricaGrega();
        } else if( s.equalsIgnoreCase( "e" ) ){
            fabrica = new FabricaEgipcia();
        }else if( s.equalsIgnoreCase( "c" ) ){
            fabrica = new FabricaChinesa();
        }
    }
}
