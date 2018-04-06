package control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Produto;
import model.Venda;

public class MercadoImpl implements MercadoControle {

	private List<Observador> listaObservadores = new ArrayList<>();
	
	@Override
	public void addObservador(Observador obs) {
		listaObservadores.add(obs);
	}

	@Override
	public void removerObservador(Observador obs) {
		listaObservadores.remove(obs);
	}

	private Venda venda;
	
	private Map<Integer, Produto> listaProdutos = new HashMap<>();
	
	public MercadoImpl() {
		listaProdutos.put(1, new Produto(1,"Brahma",2));
		listaProdutos.put(2, new Produto(2,"Skol",1.8));
		listaProdutos.put(3, new Produto(3,"Eisenbahn",5));
		listaProdutos.put(4, new Produto(4,"Heineken",4.5));
	}
	
	public void iniciarNovaVenda() {
		this.venda = new Venda();
	}

	@Override
	public Produto buscar(int codigo)throws Exception {
		return listaProdutos.get( codigo );
	}

	@Override
	public void adicionar(int codigo)throws Exception {
		Produto p = listaProdutos.get( codigo );
		if( p != null ) {
			venda.addProduto( listaProdutos.get( codigo ) );
			for( Observador obs : listaObservadores ) {
				obs.notificarProdutoAdicionado( p.getNome() );
				obs.notificarTotalVenda( venda.getTotal() );
			}
		}
	}

	private List<Venda> vendas = new ArrayList<>();
	
	@Override
	public void finalizarVenda() {
		vendas.add( venda );
		for( Observador obs : listaObservadores ) {
			obs.notificarLimparCampos();
		}
	}

	@Override
	public double getTotalGeralVendas() {
		double valorTotal = 0.0;
		for( Venda v : vendas ) {
			valorTotal += v.getTotal();
		}
		return valorTotal;
	}

}
