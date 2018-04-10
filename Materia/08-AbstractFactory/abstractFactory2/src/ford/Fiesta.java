package ford;

import abstractFactory.CarroPopular;

public class Fiesta implements CarroPopular {

	@Override
	public void exibirInfoPopular() {
		System.out.println("Modelo: Fiesta\nFabrica: Ford\nCategoria:Popular");
	}

}
