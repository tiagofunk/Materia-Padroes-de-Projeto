package model.builder;

import model.Batata;
import model.BatataGrande;
import model.Brinquedo;
import model.Carrinho;
import model.Hamburger;
import model.Sanduiche;
import model.Suco;

public class BandejaPadrao extends Bandeja {

    @Override
    public void construirSanduiche( Sanduiche sanduiche ) {
        lanche.setSanduiche( new Hamburger() );
    }

    @Override
    public void construirBatata( Batata batata ) {
        lanche.setBatata( new BatataGrande() );
    }

    @Override
    public void construirBrinquedo( Brinquedo brinquedo ) {
        lanche.setBrinquedo( new Carrinho() );
    }

    @Override
    public void construirBebida( Bebida bebida ) {
        lanche.setBebida( new Suco() );
    }
}
