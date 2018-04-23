package model.builder;

import model.BatataGrande;
import model.Carrinho;
import model.Hamburger;
import model.Suco;

public class BandejaPadrao extends Bandeja {

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
