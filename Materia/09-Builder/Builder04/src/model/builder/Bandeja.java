package model.builder;

import model.Batata;
import model.Bebida;
import model.Brinquedo;
import model.Lanche;
import model.Sanduiche;

public class Bandeja {
    
    protected Lanche lanche = new Lanche();

    public void construirSanduiche( Sanduiche  sanduiche ){
    }
    
    public void construirBatata( Batata batata ){
    }
    
    public void construirBrinquedo( Brinquedo brinquedo ){
    }
    
    public void construirBebida( Bebida bebida ){
    }
    
    public Lanche getLanche(){
        return lanche;
    }
}
