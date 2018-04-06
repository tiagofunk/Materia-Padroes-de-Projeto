package dispositivos;

import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;

import estacao.EstacaoMeteorologica;
import estacao.ObservadorTempo;

public class DispositivoWindow extends JFrame implements ObservadorTempo{

	private static final long serialVersionUID = 1L;

	private JLabel jlTemp;
	private JLabel jlUmidade;
	
	private EstacaoMeteorologica em;
	
	public DispositivoWindow(EstacaoMeteorologica em) throws HeadlessException {
		this.em = em;
		this.em.registrar( this );
		
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setSize( 110, 10 );
		
		jlTemp = new JLabel("Temp:");
        getContentPane().add(jlTemp, "North");

        jlUmidade = new JLabel("Umidade:");
        getContentPane().add(jlUmidade, "South");
		
		//pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	@Override
	public void atualizar(EstacaoMeteorologica estacao) {
		this.em = em;
		display();
	}
	
	public void display() {
		jlTemp.setText( "Temp: "  + em.getTemperatura() );
		
		jlUmidade.setText( "Umidade: " + em.getUmidade() );
	}

}
