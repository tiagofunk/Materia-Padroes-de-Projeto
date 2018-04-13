package model.abstracto;

public interface FabricaTrabalhadores {
    
    public Colhedor criarColhedor();
    public Lenhador criarLenhador();
    public Minerador criarMinerador();
}
