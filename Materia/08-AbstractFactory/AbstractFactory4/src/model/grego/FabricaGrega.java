package model.grego;

import model.abstracto.Colhedor;
import model.abstracto.FabricaTrabalhadores;
import model.abstracto.Lenhador;
import model.abstracto.Minerador;

public class FabricaGrega implements FabricaTrabalhadores{

    @Override
    public Colhedor criarColhedor() {
        return new ColhedorGrego();
    }

    @Override
    public Lenhador criarLenhador() {
        return new LenhadorGrego();
    }

    @Override
    public Minerador criarMinerador() {
        return new MineradorGrego();
    }
    
}
