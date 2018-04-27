package factory.fiat;

import factory.model.CarroEsportivo;
import factory.model.CarroPopular;
import factory.model.CarroSedan;
import factory.model.FabricaCarros;

public class FabricaCarrosFiat implements FabricaCarros {

	@Override
	public CarroPopular getCarroPopular( int ano, int velocidade) {
		return new Palio(ano, velocidade);
	}

	@Override
	public CarroSedan getCarroSedan(int ano, int velocidade, double tamanhoPortaMalas) {
		return new Siena(ano, velocidade, tamanhoPortaMalas);
	}

	@Override
	public CarroEsportivo getCarroEsportivo(int ano, int velocidade, double potenciaMotor) {
		return new Argo(ano, velocidade, potenciaMotor);
	}

}
