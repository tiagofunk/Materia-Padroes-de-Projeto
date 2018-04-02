package controller;

import java.util.ArrayList;
import java.util.List;

import model.Produto;

public class Controller {

	private List< Produto > produtos = new ArrayList<>();
	
	public  void adicionarProduto( String descricao, double preco ) {
		Produto p = new Produto( descricao, preco );
		produtos.add( p );
		for( Observador o : listaObs ) {
			o.adicionarElemento( p.getDescricao() );
		}
	}
	
	public void atualizarProduto( String descricao, double preco, int indice ) {
		Produto p = produtos.get( indice );
		p.setDescricao( descricao );
		p.setPreco( preco );
		for( Observador o : listaObs ) {
			o.atualizarElemento( descricao, indice );
		}
	}
	
	public void buscarProduto( int indice ) {
		Produto p = produtos.get( indice );
		for( Observador o : listaObs ) {
			o.inserirProduto( p.getDescricao(), p.getPreco() );
		}
	}
	
	private List< Observador > listaObs = new ArrayList<>();
	
	public void addObservador( Observador o ) {
		listaObs.add( o );
	}
	
	public void removeObservador( Observador o ) {
		listaObs.remove( o );
	}
}
