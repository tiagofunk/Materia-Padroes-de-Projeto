package resolucao;

import java.util.ArrayList;
import java.util.List;

public class Edicao  {

	private int numero;
	private List< Artigo > artigos = new ArrayList<>();
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void addArtigos( Artigo art ) {
		artigos.add( art );
	}

	public void removeArtigos( Artigo art) {
		artigos.remove( art );
	}

	public List<Artigo> getArtigos() {
		return artigos;
	}
	
}
