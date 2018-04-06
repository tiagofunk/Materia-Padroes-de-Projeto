package exe01;

public class CurrentConditionDisplay implements Observer, DisplayElement {

	private float temp;
	private Subject weatherData;
	
	public CurrentConditionDisplay( Subject weatherData ) {
		this.weatherData = weatherData;
		weatherData.registrar( this );
	}
	
	@Override
	public void display() {
		System.out.println( "Temperatura: " + temp );
	}

	@Override
	public void update(float temp) {
		this.temp = temp;
		display();
	}

}
