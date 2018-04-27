package controller;

import factory.concrete.FabricaCarrosFiat;
import factory.concrete.FabricaCarrosVolks;
import factory.model.FabricaCarros;

public class CriarFabricaCarros {

	public static FabricaCarros criarFabricaCarros() throws Exception {
		String nomeFabrica = LerArquivo.lerArquivo();
		FabricaCarros fc = null;
		
		switch (nomeFabrica) {
		case "fiat":
			fc = new FabricaCarrosFiat();
			break;

		case "volks":
			fc = new FabricaCarrosVolks();
			break;
			
		default:
			throw new Exception("Tipo de fábrica inválido");
			
		}
		
		return fc;
	}

}
