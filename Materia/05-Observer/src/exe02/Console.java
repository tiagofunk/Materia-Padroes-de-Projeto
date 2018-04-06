package exe02;

public class Console implements Observador {
	
	private Observado observado;
	
	private double temperatura, umidade;

	public Console(Observado observado) {
		this.observado = observado;
		observado.registrar( this );
	}

	@Override
	public void atualizar(double temperatura, double umidade) {
		this.temperatura = temperatura;
		this.umidade = umidade;
		display( );
	}
	
	public void display( ) {
		System.out.println( "Temperatura: " + temperatura + ", Umidade: " + umidade );
	}

}
