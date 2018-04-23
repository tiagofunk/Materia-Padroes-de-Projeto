package model.builder;

import model.Lanche;

public class Bandeja {
    
    protected Lanche lanche = new Lanche();

    public void construirSanduiche(){
    }
    
    public void construirBatata(){
    }
    
    public void construirBrinquedo(){
    }
    
    public void construirBebida(){
    }
    
    public Lanche getLanche(){
        return lanche;
    }
}
