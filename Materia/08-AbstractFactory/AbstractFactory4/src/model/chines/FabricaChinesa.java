package model.chines;

import model.abstracto.Colhedor;
import model.abstracto.FabricaTrabalhadores;
import model.abstracto.Lenhador;
import model.abstracto.Minerador;

public class FabricaChinesa implements FabricaTrabalhadores{

    @Override
    public Colhedor criarColhedor() {
        return new ColhedorChines();
    }

    @Override
    public Lenhador criarLenhador() {
        return new LenhadorChines();
    }

    @Override
    public Minerador criarMinerador() {
        return new MineradorChines();
    }
    
}
