package model.abstrato;

import java.util.HashMap;
import java.util.Map;
import model.concreto.Armadilha;

public class BuilderTime {
    
    protected FabricaPecas fp;
    protected Map<String, Peca> listasPecas;
    
    public BuilderTime( FabricaPecas fp// Time time
            ){
        this.fp = fp;
        listasPecas = new HashMap<>();
    }
    
    public void construirArmadilha(){
        Armadilha a = fp.criarArmadilha();
//        a.setTime(time);
        listasPecas.put( "armadilha", a );
    }
    
    public void construirElefante(){
        listasPecas.put( "elefante", fp.criarElefante() );
    }
    
    public void construirCachorro(){
        listasPecas.put( "cachorro", fp.criarCachorro() );
    }
    
    public void construirGato(){
        listasPecas.put( "gato", fp.criarGato());
    }
    
    public void construirLeao(){
        listasPecas.put( "leao", fp.criarLeao() );
    }
    
    public void construirLeopardo(){
        listasPecas.put( "leopardo", fp.criarLeopardo() );
    }
    
    public void construirLobo(){
        listasPecas.put( "lobo", fp.criarLobo() );
    }
    
    public void construirRato(){
        listasPecas.put( "rato", fp.criarRato() );
    }
    
    public void construirTigre(){
        listasPecas.put( "tigre", fp.criarTigre() );
    }
    
    public void construirToca(){
        listasPecas.put( "toca", fp.criarToca() );
    }
    
    public Map<String, Peca> getPecas(){
        return listasPecas;
    }

}
