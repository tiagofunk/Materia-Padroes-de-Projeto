package exe02;

import javax.swing.JOptionPane;

public class Janela implements Observador {
	
	private Observado observado;
	
	private double temperatura, umidade;
	
	public Janela(Observado observado) {
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
		JOptionPane.showMessageDialog( null, "Temperatura: " + temperatura + ", Umidade: " + umidade );
	}

}
