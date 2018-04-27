package factory.concrete;

import factory.model.CarroPopular;

public class Gol extends CarroPopular {

	public Gol(int ano, int velocidade) {
		super("Gol", "Volks", ano, velocidade);
	}

	@Override
	public void economizarCombustivel() {
		System.out.println("Gol esta economizando combustivel");
	}

	@Override
	public void andar() {
		System.out.println("Gol esta andando na velocidade de " + getVelocidade() + " km/h");
	}

}
