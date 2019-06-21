package model;

import model.abstrato.ItemTabuleiro;

public interface VisitorTabuleiro {
    
    public void visit(ItemTabuleiro item);
    
}
