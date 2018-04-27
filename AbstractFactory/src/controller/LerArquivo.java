package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {
	
	private static final String NOME_ARQUIVO = "conf.txt";

	public static String lerArquivo() throws IOException {
		String retorno = "", linha = "";
		String conteudo[];
		BufferedReader br = new BufferedReader( new FileReader( NOME_ARQUIVO ) );

		do {
			linha = br.readLine().trim();
			conteudo = linha.split(":");
			if( conteudo[ 0 ].trim().equals("tipo") ) {
				retorno = conteudo[ 1 ].trim();
				break;
			}
		}while( linha != null );
		br.close();
		return retorno;
	}

}
