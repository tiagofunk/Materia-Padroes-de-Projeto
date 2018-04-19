package model.builders;

import model.Bebida;
import model.Brinquedo;
import model.Sanduiche;
import model.TipoBebida;
import model.TipoBrinquedo;
import model.TipoSanduiche;

public class BandejaTipoB extends Bandeja {
    
    @Override
    public Sanduiche construirSanduiche(){
        return new Sanduiche( TipoSanduiche.CHEESEBURGER );
    }
    
    @Override
    public Brinquedo construirBrinquedo(){
        return new Brinquedo( TipoBrinquedo.BONEQUINHA );
    }
    
    @Override
    public Bebida construirBebida(){
        return new Bebida( TipoBebida.SUCO );
    }
}
