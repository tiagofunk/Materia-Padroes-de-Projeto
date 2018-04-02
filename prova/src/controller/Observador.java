package controller;

public interface Observador {

	public void adicionarElemento( String descricao );
	public void atualizarElemento( String descricao, int indice );
	public void inserirProduto( String descricao, double preco );
}
