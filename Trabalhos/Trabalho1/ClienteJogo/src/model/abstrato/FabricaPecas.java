package model.abstrato;

import model.concreto.Cachorro;
import model.concreto.Elefante;
import model.concreto.Gato;
import model.concreto.Leao;
import model.concreto.Leopardo;
import model.concreto.Lobo;
import model.concreto.Rato;
import model.concreto.Tigre;
import model.concreto.Toca;

public abstract class FabricaPecas {
    
    public FabricaPecas() {
    }

    public abstract Elefante criarElefante();
    public abstract Cachorro criarCachorro();
    public abstract Gato criarGato();
    public abstract Leao criarLeao();
    public abstract Leopardo criarLeopardo();
    public abstract Lobo criarLobo();
    public abstract Rato criarRato();
    public abstract Tigre criarTigre();
    
    public abstract Toca criarToca();
}
