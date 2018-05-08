

public class Deposito {

	private int qtdade;
	
	public int getQuantidade() {
		return qtdade;
	}
	
	public void armazenar(int qtdade) {
		this.qtdade += qtdade;
	}
	
	public int retirar(int qtdade) {
		if (qtdade > this.qtdade) {
			qtdade = this.qtdade;
		}
		
		this.qtdade -= qtdade;
		return qtdade;
	}
	
}
