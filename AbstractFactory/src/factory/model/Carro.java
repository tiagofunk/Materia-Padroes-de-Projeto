package factory.model;

public abstract class Carro {
	
	private String modelo;
	private String marca;
	private int ano;
	private int velocidade;
	
	public Carro(String modelo, String marca, int ano, int velocidade) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.velocidade = velocidade;
	}

	public abstract void andar();

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
}
