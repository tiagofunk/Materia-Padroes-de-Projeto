package exe02;

import java.util.ArrayList;
import java.util.List;

public class Estacao implements Observado {
	
	private List< Observador > listaObservadores = new ArrayList<>();
	
	private double temperatura;
	private double umidade;

	@Override
	public void registrar(Observador obs) {
		listaObservadores.add( obs );
	}

	@Override
	public void remover(Observador obs) {
		listaObservadores.remove( obs );
	}

	@Override
	public void notificar() {
		for( Observador obs : listaObservadores ) {
			obs.atualizar( temperatura, umidade );
		}
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
		notificar();
	}

	public double getUmidade() {
		return umidade;
	}

	public void setUmidade(double umidade) {
		this.umidade = umidade;
		notificar();
	}
	
	

}
