package factory.volks;

import factory.model.CarroEsportivo;

public class Golf extends CarroEsportivo {

	public Golf(int ano, int velocidade, double potencialMotor) {
		super("Golf", "Volks", ano, velocidade, potencialMotor);
	}

	@Override
	public void acelerar() {
		System.out.println("Golf esta acelerando");
	}

	@Override
	public void andar() {
		System.out.println("Golf esta andando na velocidade de " + getVelocidade() + " km/h");
	}

}
