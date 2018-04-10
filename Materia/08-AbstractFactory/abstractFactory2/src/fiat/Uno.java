package fiat;

import abstractFactory.CarroPopular;

public class Uno implements CarroPopular {

	@Override
	public void exibirInfoPopular() {
		System.out.println("Modelo: Uno\nFabrica: Fiat\nCategoria:Popular");
	}

}
