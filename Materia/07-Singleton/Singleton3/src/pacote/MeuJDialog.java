package pacote;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class MeuJDialog extends JDialog implements Observador {
	
	private static Random sorteio = new Random();
	private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	private final JLabel jl;
	
	public MeuJDialog( ) {
		super();
		this.jl = new JLabel( String.valueOf( Incrementar.getInstance().getValor() ) );
		Incrementar.getInstance().addObservador( this );
	}

	@Override
	public void atualizarValor(int valor) {
		jl.setText( String.valueOf(  Incrementar.getInstance().getValor() ) );
	}

	@Override
	public void pack() {
		setResizable(false);
		int x = sorteio.nextInt(screenSize.width -100);
		int y = sorteio.nextInt(screenSize.height-100);
		setLocation(x, y);
		
		JButton jb = new JButton("Add");
		jb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Incrementar.getInstance().inc();
//				jl.setText( Incrementar.getInstance().getValor()+"");
				
			}
			
		});
		

		getContentPane().add(jl, "North");
		getContentPane().add(jb, "South");
		
		super.pack();
		setVisible(true);
	}
}
