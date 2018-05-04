package model.concreto;

import model.Time;
import model.abstrato.FabricaPecas;

public class FabricaPecasAzul extends FabricaPecas {
    
    public FabricaPecasAzul() {
    }

    @Override
    public Cachorro criarCachorro() {
        return new Cachorro( Time.AZUL );
    }

    @Override
    public Elefante criarElefante() {
        return new Elefante( Time.AZUL );
    }

    @Override
    public Gato criarGato() {
        return new Gato( Time.AZUL );
    }

    @Override
    public Leao criarLeao() {
        return new Leao( Time.AZUL );
    }

    @Override
    public Leopardo criarLeopardo() {
        return new Leopardo( Time.AZUL );
    }

    @Override
    public Lobo criarLobo() {
        return new Lobo( Time.AZUL );
    }

    @Override
    public Rato criarRato() {
        return new Rato( Time.AZUL );
    }

    @Override
    public Tigre criarTigre() {
        return new Tigre( Time.AZUL );
    }

    @Override
    public Armadilha criarArmadilha() {
        return new Armadilha( Time.AZUL );
    }

    @Override
    public Toca criarToca() {
        return new Toca( Time.AZUL );
    }
}
