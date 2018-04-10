package fiat;

import abstractFactory.CarroSedan;

public class Siena implements CarroSedan {

	@Override
	public void exibirInfoSedan() {
		System.out.println("Modelo: Siena\nFabrica: Fiat\nCategoria:Popular");
	}

}
