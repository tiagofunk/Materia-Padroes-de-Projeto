package factory.ford;

import factory.model.CarroPopular;

public class Fiesta extends CarroPopular {

	public Fiesta(int ano, int velocidade) {
		super("Fiesta", "Ford", ano, velocidade);
	}

	@Override
	public void economizarCombustivel() {
		System.out.println("Fiesta esta econimizando combustivel");
	}

	@Override
	public void andar() {
		System.out.println("Fiesta esta andando na velocidade " + getVelocidade() + " km/h");
	}

}
