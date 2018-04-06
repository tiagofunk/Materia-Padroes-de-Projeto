package model;

import java.util.ArrayList;
import java.util.List;

public class Deposito {

	private int qtdadeAtual;
	private int qtdadeCritica;
	private int qtdadeMax;
	
	private List<Observador> listaObservadores = new ArrayList<>();
	
	public Deposito(int qtdadeCritica, int qtdadeMax) {
		super();
		this.qtdadeCritica = qtdadeCritica;
		this.qtdadeMax = qtdadeMax;
	}
	
	public void adicionar( int qtdade ) throws Exception {
		boolean lancouExcecao = false;
		int quantidadeAdicionada;
		if( ( qtdadeAtual + qtdade ) > qtdadeMax ) {
			quantidadeAdicionada = qtdadeMax - qtdadeAtual;
			qtdadeAtual = qtdadeMax;
			lancouExcecao = true;
		}else {
			qtdadeAtual += qtdade;
			quantidadeAdicionada = qtdade;
		}
		for( Observador obs : listaObservadores ) {
			obs.setQuantidadeAtual( qtdadeAtual );
			obs.setQuantidadeAdicionada( quantidadeAdicionada );
		}
		if(lancouExcecao ) {
			throw new Exception( );
		}
	}
	
	public int retirar( int qtdade ) {
		int quantidadeRetirada;
		if( qtdade > qtdadeAtual ) {
			quantidadeRetirada = qtdadeAtual;
			qtdadeAtual = 0;
		}else {
			quantidadeRetirada = qtdade;
			qtdadeAtual -= qtdade;
		}
		for( Observador obs : listaObservadores ) {
			obs.setQuantidadeAtual( qtdadeAtual );
			obs.setQuantidadeRetirada( quantidadeRetirada );
		}
		return quantidadeRetirada;
	}
	
	public void addObservador( Observador obs ) {
		listaObservadores.add( obs );
	}
	
	public void removeObservador( Observador obs ) {
		listaObservadores.remove( obs );
	}
	
}
