package factory.fiat;

import factory.model.CarroEsportivo;

public class Argo extends CarroEsportivo {

	public Argo(int ano, int velocidade, double potencialMotor) {
		super("Argo", "Fiat", ano, velocidade, potencialMotor);
	}

	@Override
	public void acelerar() {
		System.out.println("Argo esta acelerando");
	}

	@Override
	public void andar() {
		System.out.println("Argo esta andando na velocidade de " + getVelocidade() + " km/h");
	}

}
