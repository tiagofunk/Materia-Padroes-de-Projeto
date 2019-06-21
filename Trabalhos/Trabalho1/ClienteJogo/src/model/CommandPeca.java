package model;

import model.abstrato.ItemTabuleiro;

public interface CommandPeca {
    
    public void execute(ItemTabuleiro[] pecas, TipoTime time);//, List<ObservadorValidadorJogada> listaObs);
    
}
