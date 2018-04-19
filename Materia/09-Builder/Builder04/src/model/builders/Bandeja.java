package model.builders;

import model.Batata;
import model.Bebida;
import model.Brinquedo;
import model.Sanduiche;
import model.TipoBatata;

public abstract class Bandeja {
    
    private Sanduiche sanduiche;
    private Batata batata;
    private Brinquedo brinquedo;
    private Bebida bebida;
    
    public Sanduiche construirSanduiche(){
        return null;
    }
    
    public Batata construirBatata( TipoBatata tipo ){
        return new Batata( tipo );
    }
    
    public Brinquedo construirBrinquedo(){
        return null;
    }
    
    public Bebida construirBebida(){
        return null;
    }
}
