package exe03;

public class Console implements Observador {
	
	private Observado obser;
	
	private double temperatura, umidade;
	
	public Console(Observado obser) {
		this.obser = obser;
		obser.registrar( this );
	}

	@Override
	public void updateTemperatura(double temperatura) {
		this.temperatura = temperatura;
		display();
	}

	@Override
	public void updateUmidade(double umidade) {
		this.umidade = umidade;
		display();
	}
	
	public void display( ) {
		System.out.println("Temperatura: " + temperatura + ", Umidade: " + umidade );
	}

}
