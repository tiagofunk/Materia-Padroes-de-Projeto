package exe01;

public class Estacao {

	public static void main( String[] args ) {
		WeatherData wd = new WeatherData();
		
		CurrentConditionDisplay ccd = new CurrentConditionDisplay( wd );
		
		wd.setTemp( 20 );
		wd.setTemp( 40 );
		wd.setTemp( 60 );
	}
}
