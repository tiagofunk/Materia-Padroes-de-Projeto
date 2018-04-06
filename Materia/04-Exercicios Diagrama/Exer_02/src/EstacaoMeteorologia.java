import java.util.List;

public class EstacaoMeteorologia {
	
	private SensorUmidade sensorTemp;
	private SensorTemperatura sensorUmidade;
	private List<ObservadorTempo> observadores;

	public void ligar() {
		
	}
	
	public double getTemperatura() {
		return 0.0;
	}
	
	public double getUmidade() {
		return 0.0;
	}
	
	public void anexar( ObservadorTempo obs ) {
		
	}
	
	public void desanexar( ObservadorTempo obs ) {
		
	}
	
	public void notificar() {
		double temperatura, umidade;
		for( ObservadorTempo obs: observadores ) {
			obs.atualizar( this );
			
			this.getTemperatura();			
			temperatura = sensorTemp.getMedicao();
			
			this.getUmidade();
			umidade = sensorUmidade.getMedicao();
		}
	}

	public SensorUmidade getSensorTemp() {
		return sensorTemp;
	}

	public void setSensorTemp(SensorUmidade sensorTemp) {
		this.sensorTemp = sensorTemp;
	}

	public SensorTemperatura getSensorUmidade() {
		return sensorUmidade;
	}

	public void setSensorUmidade(SensorTemperatura sensorUmidade) {
		this.sensorUmidade = sensorUmidade;
	}
	
	public void addObservador( ObservadorTempo obs ) {

	}
	
	public void removeObservador( ObservadorTempo obs ) {

	}
}
