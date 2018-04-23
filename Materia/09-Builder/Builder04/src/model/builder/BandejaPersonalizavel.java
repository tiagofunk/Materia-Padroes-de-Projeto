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

    @Override
    public void construirSanduiche( Sanduiche sanduiche ) {
        lanche.setSanduiche( sanduiche );
    }

    @Override
    public void construirBatata( Batata batata ) {
        lanche.setBatata( batata );
    }

    @Override
    public void construirBrinquedo( Brinquedo brinquedo ) {
        lanche.setBrinquedo( brinquedo );
    }

    @Override
    public void construirBebida( Bebida bebida ) {
        lanche.setBebida( bebida );
    }
}
