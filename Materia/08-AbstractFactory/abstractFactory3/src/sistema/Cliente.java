package sistema;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import model.abstrato.FabricaPizza;
import model.abstrato.Pizza;
import model.gourmet.FabricaGourmet;
import model.siciliano.FabricaSiliciano;

@SuppressWarnings("serial")
public class Cliente extends JFrame {

	private JRadioButton jrbSiciliano;
	private JRadioButton jrbGourmet;
	private JRadioButton jrbVegetariana;
	private JRadioButton jrbQueijo;
	private JButton criarPizza;

	public Cliente() {
		setResizable(false);
		setTitle("Pizzaria");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(200, 180);
		
		ButtonGroup buttonGroup1 = new ButtonGroup();
		jrbSiciliano = new JRadioButton("Siciliano");
		jrbGourmet = new JRadioButton("Gourmet");
		buttonGroup1.add(jrbSiciliano);
		buttonGroup1.add(jrbGourmet);
		
		JPanel jp1 = new JPanel();
		jp1.setBorder(BorderFactory.createTitledBorder("Estilo da Pizza"));
		jp1.add(jrbSiciliano);
		jp1.add(jrbGourmet);
		
		add(jp1, BorderLayout.NORTH);

		ButtonGroup buttonGroup2 = new ButtonGroup();
		jrbQueijo = new JRadioButton("4 Queijos");
		jrbVegetariana = new JRadioButton("Vegetariana");
		buttonGroup2.add(jrbQueijo);
		buttonGroup2.add(jrbVegetariana);

		JPanel jp2 = new JPanel();
		jp2.setBorder(BorderFactory.createTitledBorder("Sabores da Pizza"));
		jp2.add(jrbQueijo);
		jp2.add(jrbVegetariana);
		
		add(jp2, BorderLayout.CENTER);
		
		criarPizza = new JButton("Criar pizza");
		add(criarPizza, BorderLayout.SOUTH);
		
		ActionListener criarModoDePreparo = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				criarModoDePreparo(event.getActionCommand());
				
			}
		};
		
		jrbSiciliano.addActionListener(criarModoDePreparo);
		jrbGourmet.addActionListener(criarModoDePreparo);
		
		jrbSiciliano.setSelected(true);
		criarModoDePreparo(jrbSiciliano.getActionCommand());

		jrbQueijo.setSelected(true);
		
		criarPizza.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				/* 
				 * Com base na forma de preparo (gourmet ou siciliana) 
				 * e no sabor de pizza (queijo ou vegetariana),
				 * invocar o método da fábrica para produzir 
				 * uma Pizza e guardar na variavel pizza. 
				 */
				Pizza pizza = null;
				FabricaPizza fp = criarModoDePreparo( jrbGourmet.isSelected()?"Gourmet":"Siciliano" );
				if (jrbQueijo.isSelected()) {
					pizza = fp.criarPizzaQuatroQueijos();
				} else {
					pizza = fp.criarPizzaQuatroQueijos();
				}
				JOptionPane.showMessageDialog(null, pizza.toString() );
			}
			
		});
		
	}
	
	protected FabricaPizza criarModoDePreparo(String tipoModoPreparo) {
		
		if (tipoModoPreparo.equals("Gourmet")) {
			return new FabricaGourmet();
		} else {
			return new FabricaSiliciano();
		}
		
	}

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setVisible(true);
	}
	
}
