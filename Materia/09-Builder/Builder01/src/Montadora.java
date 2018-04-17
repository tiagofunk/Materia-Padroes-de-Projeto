import builder.Robo;
import produto.Carro;

public class Montadora {

	private Robo robo;

	public Montadora(Robo robo) {
		this.robo = robo;
	}
	
	public void construir() {
		robo.constroiMotor();
		robo.constroiPneus();
	}

	public Carro getCarro() {
		return robo.getCarro();
	}
}
