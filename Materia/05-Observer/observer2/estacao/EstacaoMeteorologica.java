package estacao;

import java.util.ArrayList;
import java.util.List;

import sensores.SensorTemperatura;
import sensores.SensorUmidade;

public class EstacaoMeteorologica {
	
	private List< ObservadorTempo > listaObservadores = new ArrayList<>();
	
	private SensorTemperatura sensorTemp;
	private SensorUmidade sensorUmidade;
	
	private double umid;
	private double temp;
	
	public void registrar( ObservadorTempo obs ) {
		listaObservadores.add( obs );
	}
	
	public void remover( ObservadorTempo obs ) {
		listaObservadores.remove( obs );
	}
	
	public void notificar() {
		for( ObservadorTempo obs : listaObservadores ) {
			obs.atualizar( this );
		}
	}
	
	public SensorTemperatura getSensorTemp() {
		return sensorTemp;
	}
	
	public void setSensorTemp(SensorTemperatura sensorTemp) {
		this.sensorTemp = sensorTemp;
		notificar();
	}
	
	public SensorUmidade getSensorUmidade() {
		return sensorUmidade;
	}
	
	public void setSensorUmidade(SensorUmidade sensorUmidade) {
		this.sensorUmidade = sensorUmidade;
		notificar();
	}

	public double getTemperatura() {
		return temp;
	}

	public double getUmidade() {
		return umid;
	}
	

	public void ligar() {
		Thread t = new Thread() {
			
			@Override
			public void run() {
				int i = 1;
				while (true) {
					temp = sensorTemp.getMedicao();
					umid = sensorUmidade.getMedicao();
					
					notificar();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
		};
		t.start();
	}
	

}
