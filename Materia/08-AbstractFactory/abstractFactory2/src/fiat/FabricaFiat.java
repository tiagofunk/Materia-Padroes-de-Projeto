package fiat;

import abstractFactory.CarroPopular;
import abstractFactory.CarroSedan;
import abstractFactory.FabricaDeCarro;

public class FabricaFiat extends FabricaDeCarro {

	@Override
	public CarroSedan criarCarroSedan() {
		return new Siena();
	}

	@Override
	public CarroPopular criarCarroPopular() {
		return new Uno();
	}

}
