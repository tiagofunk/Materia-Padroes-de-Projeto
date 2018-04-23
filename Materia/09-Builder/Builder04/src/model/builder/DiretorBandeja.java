package model.builder;

import model.Batata;
import model.Bebida;
import model.Brinquedo;
import model.Sanduiche;

public class DiretorBandeja {

    private Bandeja bandeja;

    public DiretorBandeja(Bandeja bandeja) {
        this.bandeja = bandeja;
    }

    public void construir(){
        bandeja.construirSanduiche();
        bandeja.construirBatata();
        bandeja.construirBebida();
        bandeja.construirBrinquedo();
    }
    
    public void mudarSanduiche( Sanduiche sanduiche ){
        if( sanduiche != null ){
            lanche.setSanduiche( sanduiche );
        }
    }
    
    public void mudarBatata( Batata batata ){
        if( batata != null ){
            lanche.setBatata( batata );
        }
    }
    
    public void mudarBrinquedo( Brinquedo brinquedo ){
        if( brinquedo != null ){
            lanche.setBrinquedo( brinquedo );
        }
    }
    
    public void mudarBebida( Bebida bebida ){
        if( bebida != null ){
            lanche.setBebida( bebida );
        }
    }
    
    public Bandeja getBandeja() {
        return bandeja;
    }
    
}
