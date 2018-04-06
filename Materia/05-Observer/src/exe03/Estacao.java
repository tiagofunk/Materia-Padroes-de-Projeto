package exe03;

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

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
		for( Observador obs : listaObservadores ) {
			obs.updateTemperatura( this.temperatura );
		}
	}

	public double getUmidade() {
		return umidade;
	}

	public void setUmidade(double umidade) {
		this.umidade = umidade;
		for( Observador obs : listaObservadores ) {
			obs.updateUmidade( this.umidade );
		}
	}

}
