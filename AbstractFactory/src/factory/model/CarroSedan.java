package factory.model;

public abstract class CarroSedan extends Carro {
	
	private double tamanhoPortasMalas;
	
	public CarroSedan(String modelo, String marca, int ano, int velocidade, double tamanhoPortaMalas) {
		super(modelo, marca, ano, velocidade);
		this.tamanhoPortasMalas = tamanhoPortaMalas;
	}
	
	public abstract void encherPortaMalas();

	public double getTamanhoPortasMalas() {
		return tamanhoPortasMalas;
	}

	public void setTamanhoPortasMalas(double tamanhoPortasMalas) {
		this.tamanhoPortasMalas = tamanhoPortasMalas;
	}

}
