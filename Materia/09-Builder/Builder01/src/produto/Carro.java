package produto;

import java.util.Arrays;

public class Carro {

	private Motor motor;
	private Pneu[] pneus;

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	public void setPneus(Pneu... pneus) {
		this.pneus = pneus;
	}
	
	@Override
	public String toString() {
		return motor + " " + Arrays.toString(pneus);
	}

}

