package factory.ford;

import factory.model.CarroEsportivo;
import factory.model.CarroPopular;
import factory.model.CarroSedan;
import factory.model.FabricaCarros;

public class FabricaCarrosFord implements FabricaCarros{

	@Override
	public CarroPopular getCarroPopular(int ano, int velocidade) {
		return new Fiesta(ano, velocidade);
	}

	@Override
	public CarroSedan getCarroSedan(int ano, int velocidade, double tamanhoPortaMalas) {
		return new FiestaSedan(ano, velocidade, tamanhoPortaMalas);
	}

	@Override
	public CarroEsportivo getCarroEsportivo(int ano, int velocidade, double potenciaMotor) {
		return new Mustang(ano, velocidade, potenciaMotor);
	}
	

}
