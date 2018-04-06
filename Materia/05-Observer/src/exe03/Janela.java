package exe03;

import javax.swing.JOptionPane;

public class Janela implements Observador {
	
	private Observado obser;
	
	private double temperatura, umidade;

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
		JOptionPane.showMessageDialog( null, "Temperatura: " + temperatura + ", Umidade: " + umidade );
	}

}
