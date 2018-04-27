package factory.model;

public interface FabricaCarros {
	
	public CarroPopular getCarroPopular( int ano, int velocidade);
	public CarroSedan getCarroSedan( int ano, int velocidade, double tamanhoPortaMalas);

}
