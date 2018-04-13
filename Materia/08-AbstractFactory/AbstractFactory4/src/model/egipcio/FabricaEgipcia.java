package model.egipcio;

import model.abstracto.Colhedor;
import model.abstracto.FabricaTrabalhadores;
import model.abstracto.Lenhador;
import model.abstracto.Minerador;

public class FabricaEgipcia implements FabricaTrabalhadores{

    @Override
    public Colhedor criarColhedor() {
        return new ColhedorEgipcio();
    }

    @Override
    public Lenhador criarLenhador() {
        return new LenhadorEgipcio();
    }

    @Override
    public Minerador criarMinerador() {
        return new MineradorEgipcio();
    }
    
}
