package builder;

import produto.Motor1_0;
import produto.Pneu14;

public class RoboParaPopular extends Robo {

	@Override
	public void constroiMotor() {
		carro.setMotor(new Motor1_0());
	}
	
	@Override
	public void constroiPneus() {
		carro.setPneus(new Pneu14(), new Pneu14(), new Pneu14(), new Pneu14());
	}
}
