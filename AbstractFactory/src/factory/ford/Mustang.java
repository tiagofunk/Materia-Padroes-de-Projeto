package factory.ford;

import factory.model.CarroEsportivo;

public class Mustang extends CarroEsportivo {

	public Mustang(int ano, int velocidade, double potencialMotor) {
		super("Mustang", "Ford", ano, velocidade, potencialMotor);
	}

	@Override
	public void acelerar() {
		System.out.println("Mustang esta acelerando");
	}

	@Override
	public void andar() {
		System.out.println("Mustang esta andando na velocidade de " + getVelocidade() + " km/h");
	}

}
