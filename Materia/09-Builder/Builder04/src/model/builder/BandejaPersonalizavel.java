package model.builder;

import model.Batata;
import model.BatataGrande;
import model.Bebida;
import model.Brinquedo;
import model.Carrinho;
import model.Hamburger;
import model.Sanduiche;
import model.Suco;

public class BandejaPersonalizavel extends Bandeja {

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
    
    @Override
    public void construirSanduiche() {
        lanche.setSanduiche( new Hamburger() );
    }

    @Override
    public void construirBatata() {
        lanche.setBatata( new BatataGrande() );
    }

    @Override
    public void construirBrinquedo() {
        lanche.setBrinquedo( new Carrinho() );
    }

    @Override
    public void construirBebida() {
        lanche.setBebida( new Suco() );
    }
}
