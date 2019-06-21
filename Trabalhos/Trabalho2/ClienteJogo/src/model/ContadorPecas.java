package model;

import model.abstrato.ItemTabuleiro;

public class ContadorPecas implements VisitorTabuleiro{

    private int contador = 0;
    private TipoTime time;

    public ContadorPecas(TipoTime time) {
        this.time = time;
    }
    
    @Override
    public void visit(ItemTabuleiro item) {
        if(item.possuiPecaMovimental() && 
            item.getPecaMovimentavel().getTime() == time ){
            contador++;
        }
    }

    public int getContador() {
        return contador;
    }
}
