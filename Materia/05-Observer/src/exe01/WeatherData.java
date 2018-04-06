package exe01;
import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
	
	private List<Observer> listaObservadores = new ArrayList<>();
	private float temp;
	
	@Override
	public void registrar(Observer obs) {
		listaObservadores.add( obs );
	}

	@Override
	public void remover(Observer obs) {
		listaObservadores.remove( obs );
	}

	@Override
	public void notificar() {
		for( Observer obs : listaObservadores ) {
			obs.update( temp );
		}
	}
	
	public void  dadosAlterados() {
		notificar();
	}

	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
		dadosAlterados();
	}
	

}
