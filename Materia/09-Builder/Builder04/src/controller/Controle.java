package controller;

import java.util.Scanner;
import model.Batata;
import model.Bebida;
import model.Brinquedo;
import model.Sanduiche;
import model.TipoBatata;
import model.builders.Bandeja;
import model.builders.BandejaTipoA;
import model.builders.BandejaTipoB;

public class Controle {

    public void executar(){
        int opcao;
        Scanner ler = new Scanner( System.in );
        Bandeja bandeja = null;
        
        do{
            System.out.println("Escolha o seu lanche:\n"
                + "1-Hamburger, Coca e Carrinho\n"
                + "2-Cheeseburger, suco e Bonequinha");
            opcao = ler.nextInt();
            
        }while( opcao != 1 && opcao != 2 );
        
        if( opcao == 1 ){
            bandeja = new BandejaTipoA();
        }else if( opcao == 2 ){
            bandeja = new BandejaTipoB();
        }
        
        do{
            System.out.println("Escolha a sua porção de batata:\n"
                + "1-Pequena\n"
                + "2-Média\n"
                + "3-Grande");
            opcao = ler.nextInt();
        }while( opcao != 1 && opcao != 2 && opcao != 3 );
        
        Sanduiche sand = bandeja.construirSanduiche();
        Bebida beb = bandeja.construirBebida();
        Brinquedo briq = bandeja.construirBrinquedo();
        Batata bat = null;
        
        if( opcao == 1 ){
            bat = bandeja.construirBatata( TipoBatata.PEQUENA );
        }else if( opcao == 2 ){
            bat = bandeja.construirBatata( TipoBatata.MEDIA );
        }else if( opcao == 3 ){
            bat = bandeja.construirBatata( TipoBatata.GRANDE );
        }
        
        System.out.println( sand );
        System.out.println( beb );
        System.out.println( briq );
        System.out.println( bat );
    }
    
    public static void main(String[] args) {
        Controle c = new Controle();
        c.executar();
    }
}
