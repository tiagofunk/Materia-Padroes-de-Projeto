package builder;

import produto.Carro;

public abstract class Robo {

    protected Carro carro;

    public Robo() {
        this.carro = new Carro();
    }

    public Carro getCarro() {
        return carro;
    }

    public void constroiMotor() {
    }

    public void constroiPneus() {
    }

}
