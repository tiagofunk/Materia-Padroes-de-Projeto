package ford;

import abstractFactory.CarroPopular;
import abstractFactory.CarroSedan;
import abstractFactory.FabricaDeCarro;

public class FabricaFord extends FabricaDeCarro {

	@Override
	public CarroSedan criarCarroSedan() {
		return new FiestaSedan();
	}

	@Override
	public CarroPopular criarCarroPopular() {
		return new Fiesta();
	}

}
