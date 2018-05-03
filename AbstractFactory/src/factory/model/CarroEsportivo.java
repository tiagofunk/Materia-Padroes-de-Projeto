package factory.model;

public abstract class CarroEsportivo extends Carro {
	
	private double potenciaMotor;

	public CarroEsportivo(String modelo, String marca, int ano, int velocidade, double potenciaMotor) {
		super(modelo, marca, ano, velocidade);
		this.potenciaMotor = potenciaMotor;
	}
	
	public abstract void acelerar();

	public double getPotenciaMotor() {
		return potenciaMotor;
	}

	public void setPotenciaMotor(double potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}
	
	

}
