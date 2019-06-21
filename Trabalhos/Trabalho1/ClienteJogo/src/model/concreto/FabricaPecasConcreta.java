package model.concreto;

import model.abstrato.FabricaPecas;

public class FabricaPecasConcreta extends FabricaPecas{

    public FabricaPecasConcreta() {
    }

    @Override
    public Cachorro criarCachorro() {
        return new Cachorro();
    }

    @Override
    public Elefante criarElefante() {
        return new Elefante();
    }

    @Override
    public Gato criarGato() {
        return new Gato();
    }

    @Override
    public Leao criarLeao() {
        return new Leao();
    }

    @Override
    public Leopardo criarLeopardo() {
        return new Leopardo();
    }

    @Override
    public Lobo criarLobo() {
        return new Lobo();
    }

    @Override
    public Rato criarRato() {
        return new Rato();
    }

    @Override
    public Tigre criarTigre() {
        return new Tigre();
    }

    @Override
    public Toca criarToca() {
        return new Toca();
    }
    
}
