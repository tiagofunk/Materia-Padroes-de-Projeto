package factory.model;

public abstract class CarroPopular extends Carro {

	public CarroPopular(String modelo, String marca, int ano, int velocidade) {
		super(modelo, marca, ano, velocidade);
	}

	public abstract void economizarCombustivel();
}
