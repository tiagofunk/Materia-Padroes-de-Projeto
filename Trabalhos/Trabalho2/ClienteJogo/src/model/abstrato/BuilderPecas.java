package model.abstrato;

import java.util.HashMap;
import java.util.Map;
import model.TipoTime;

public abstract class BuilderPecas {
    
    protected TipoTime time;
    protected FabricaPecas fp;
    protected Map<String, Peca> listasPecas;

    public BuilderPecas(FabricaPecas fp, TipoTime time) {
        this.time = time;
        this.fp = fp;
        listasPecas = new HashMap<>();
    }
    
    public void construirElefante(){
    }
    
    public void construirCachorro(){
    }
    
    public void construirGato(){
    }
    
    public void construirLeao(){
    }
    
    public void construirLeopardo(){
    }
    
    public void construirLobo(){
    }
    
    public void construirRato(){
    }
    
    public void construirTigre(){
    }
    
    public void construirToca(){
    }
    
    public Map<String, Peca> getPecas(){
        return listasPecas;
    }
}
