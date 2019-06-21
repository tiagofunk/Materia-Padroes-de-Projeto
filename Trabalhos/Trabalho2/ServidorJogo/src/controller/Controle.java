package controller;

import java.io.IOException;
import model.Partida;

public class Controle {
    
    public Controle( int porta1, int porta2){
        try {
            Partida p1 = new Partida( porta1, porta2 );
            p1.iniciarPatida();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
    public static void main(String[] args) {
        int porta1, porta2;
        if( args.length == 2 ){
            try{
                porta1 = Integer.parseInt( args[ 0 ] );
                porta2 = Integer.parseInt( args[ 1 ] );
            }catch( NumberFormatException ex ){
                throw new RuntimeException("Valor para portas inválido !!");
            }
        }else{
            throw new RuntimeException("Valor para portas inválido !!");
        }
        Controle c = new Controle( porta1, porta2 );
    }
}
