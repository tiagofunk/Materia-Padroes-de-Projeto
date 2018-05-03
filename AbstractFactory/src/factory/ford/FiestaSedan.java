package factory.ford;

import factory.model.CarroSedan;

public class FiestaSedan extends CarroSedan {

	public FiestaSedan(int ano, int velocidade, double tamanhoPortaMalas) {
		super("Fiesta Sedan", "Ford", ano, velocidade, tamanhoPortaMalas);
	}

	@Override
	public void encherPortaMalas() {
		System.out.println("Fiesta Sedan esta enchendo portas malas");
	}

	@Override
	public void andar() {
		System.out.println("Fiesta Sedan esta andando na velocidade de " + getVelocidade() + " km/h");
	}

}
