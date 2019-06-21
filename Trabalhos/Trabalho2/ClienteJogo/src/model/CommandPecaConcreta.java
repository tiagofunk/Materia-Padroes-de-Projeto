package model;

import model.abstrato.ItemTabuleiro;

public class CommandPecaConcreta implements CommandPeca{

    @Override
    public void execute(ItemTabuleiro[] pecas, TipoTime time ){
        pecas[ 0 ].validarAtaque(pecas, time);
    }
    
}
