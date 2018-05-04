package controller;

import java.io.IOException;
import model.Partida;

public class Controle {
    
    public Controle(){
        try {
            Partida p1 = new Partida();
            p1.iniciarPatida();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
    public static void main(String[] args) {
        Controle c = new Controle();
    }
}
