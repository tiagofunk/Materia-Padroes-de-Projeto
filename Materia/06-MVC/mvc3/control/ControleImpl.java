package control;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ControleImpl implements Controle {
	
	private List< Observador > listaObservador = new ArrayList<>();
	
	private int linhaSelecionada;
	private List< Object[] > listaValores = new ArrayList<>();

	@Override
	public void addLinha(String texto, String numero, boolean booleano) throws Exception {
		listaValores.add( new Object[] { texto, numero, booleano} );
	}

	@Override
	public int getQtasLinhas() {
		return listaValores.size();
	}

	@Override
	public Object getValor(int row, int col) {
		return listaValores.get( row )[ col ];
	}

	@Override
	public Collection<?> getItens() {
		return listaValores;
	}

	@Override
	public void carregarLinha(int row) {
		Object[] linha = listaValores.get( row );
		linhaSelecionada = row;
		for( Observador obs : listaObservador ) {
			obs.carregarCampos( 
					linha[ 0 ].toString(), 
					linha[ 1 ].toString(), 
					linha[ 2 ].toString().equals("true")
			);
		}
	}

	@Override
	public int alterarLinha(String texto, String numero, boolean booleano) {
		Object[] linha = listaValores.get( linhaSelecionada );
		linha[ 0 ] = texto;
		linha[ 1 ] = numero;
		linha[ 2 ] = booleano;
		return linhaSelecionada;
	}

	@Override
	public void addObservador(Observador obs) {
		listaObservador.add( obs );
	}

	@Override
	public void removeObservador(Observador obs) {
		listaObservador.remove( obs );
	}

}
