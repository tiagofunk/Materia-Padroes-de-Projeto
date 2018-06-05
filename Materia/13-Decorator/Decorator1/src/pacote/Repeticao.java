
import pacote.Arma;


public class Repeticao extends ArmaDecorator {

	public Repeticao(Arma arma) {
		super(arma);
	}

	public void atirar() {
		for (int i = 1; i <= 5; i++)
			super.atirar();
	}
	
}
