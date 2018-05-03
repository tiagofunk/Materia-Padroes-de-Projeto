package controller;

import factory.fiat.FabricaCarrosFiat;
import factory.ford.FabricaCarrosFord;
import factory.model.FabricaCarros;
import factory.volks.FabricaCarrosVolks;

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
			
		case "ford":
			fc = new FabricaCarrosFord();
			break;
			
		default:
			throw new Exception("Tipo de fábrica inválido");
			
		}
		
		return fc;
	}

}
