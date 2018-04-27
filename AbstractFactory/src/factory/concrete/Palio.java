package factory.concrete;

import factory.model.CarroPopular;

public class Palio extends CarroPopular {

	public Palio(int ano, int velocidade) {
		super("Palio", "Fiat", ano, velocidade);
	}

	@Override
	public void economizarCombustivel() {
		System.out.println("Palio esta economizando combustivel");
	}

	@Override
	public void andar() {
		System.out.println("Palio andando na velocidade de " + getVelocidade() + " km/h");
	}

}
