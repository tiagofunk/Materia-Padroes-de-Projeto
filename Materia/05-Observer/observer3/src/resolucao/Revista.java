package resolucao;

import java.util.ArrayList;
import java.util.List;

public class Revista implements Subject {

	private String nome;
	private List< Edicao > edicoes = new ArrayList<>();
	
	private List< Observer > listaObservadores = new ArrayList<>();
	
	
	@Override
	public void registrar(Observer obs) {
		listaObservadores.add( obs );
	}
	
	@Override
	public void remover(Observer obs) {
		listaObservadores.remove( obs );
	}
	
//	@Override
//	public void notificar() {
//		
//	}
	
	public void lancarNovaEdicao( Edicao edicao ) {
		edicoes.add( edicao );
		
		for( Observer obs : listaObservadores ) {
			obs.update( this, edicao );
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void removeEdicao( Edicao edi) {
		edicoes.remove( edi );
	}

	public List< Edicao > getEdicoes() {
		return edicoes;
	}
}
