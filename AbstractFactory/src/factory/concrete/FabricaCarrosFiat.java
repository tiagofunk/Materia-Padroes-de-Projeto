package factory.concrete;

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

}
