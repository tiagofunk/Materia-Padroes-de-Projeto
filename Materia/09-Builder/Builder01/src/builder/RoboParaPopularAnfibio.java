package builder;

import produto.Pneu14;

public class RoboParaPopularAnfibio extends RoboParaPopular {

	@Override
	public void constroiPneus() {
		carro.setPneus(new Pneu14(), new Pneu14(), new Pneu14(), new Pneu14(), new Pneu14(), new Pneu14());
	}
	
}
