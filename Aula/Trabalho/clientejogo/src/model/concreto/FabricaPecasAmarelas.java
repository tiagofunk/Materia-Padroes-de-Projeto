package model.concreto;

import model.Time;
import model.abstrato.FabricaPecas;

public class FabricaPecasAmarelas extends FabricaPecas{

    public FabricaPecasAmarelas() {
    }

    @Override
    public Cachorro criarCachorro() {
        return new Cachorro( Time.AMARELO );
    }

    @Override
    public Elefante criarElefante() {
        return new Elefante( Time.AMARELO );
    }

    @Override
    public Gato criarGato() {
        return new Gato( Time.AMARELO );
    }

    @Override
    public Leao criarLeao() {
        return new Leao( Time.AMARELO );
    }

    @Override
    public Leopardo criarLeopardo() {
        return new Leopardo( Time.AMARELO );
    }

    @Override
    public Lobo criarLobo() {
        return new Lobo( Time.AMARELO );
    }

    @Override
    public Rato criarRato() {
        return new Rato( Time.AMARELO );
    }

    @Override
    public Tigre criarTigre() {
        return new Tigre( Time.AMARELO );
    }

    @Override
    public Armadilha criarArmadilha() {
        return new Armadilha( Time.AMARELO );
    }

    @Override
    public Toca criarToca() {
        return new Toca( Time.AMARELO );
    }
    
}
