package factory.fiat;

import factory.model.CarroSedan;

public class Siena extends CarroSedan {

	public Siena(int ano, int velocidade, double tamanhoPortaMalas) {
		super("Siena", "Fiat", ano, velocidade, tamanhoPortaMalas);
	}

	@Override
	public void encherPortaMalas() {
		System.out.println("Siena enchendo o porta malas");
	}

	@Override
	public void andar() {
		System.out.println("Siena andando na velocidade de " + (getVelocidade() - 10) + " km/h");
	}

}
