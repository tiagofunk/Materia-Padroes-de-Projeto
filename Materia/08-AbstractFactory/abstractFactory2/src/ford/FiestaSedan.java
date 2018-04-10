package ford;

import abstractFactory.CarroSedan;

public class FiestaSedan implements CarroSedan {

	@Override
	public void exibirInfoSedan() {
		System.out.println("Modelo: Fiesta\nFabrica:Ford\nCategoria:Sedan");
	}

}
