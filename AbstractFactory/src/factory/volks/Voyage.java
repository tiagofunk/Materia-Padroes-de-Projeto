package factory.volks;

import factory.model.CarroSedan;

public class Voyage extends CarroSedan {

	public Voyage(int ano, int velocidade, double tamanhoPortaMalas) {
		super("Voyage", "Volks", ano, velocidade, tamanhoPortaMalas);
	}

	@Override
	public void encherPortaMalas() {
		System.out.println("Voyage esta enchendo o porta malas");
	}

	@Override
	public void andar() {
		System.out.println("Voyage esta andando na velocidade de " + getVelocidade() + " km/h");
	}

}
