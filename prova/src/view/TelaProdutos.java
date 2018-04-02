package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import controller.Controller;
import controller.Observador;
import model.Produto;

public class TelaProdutos extends JFrame implements Observador {
	
	private Controller controle;
	
	@Override
	public void adicionarElemento(String descricao) {
		model.addElement( descricao );
	}

	@Override
	public void atualizarElemento(String descricao, int indice) {
		model.set( indice, descricao );
	}

	@Override
	public void inserirProduto(String descricao, double preco) {
		tfNome.setText( descricao );
		tfPreco.setText( String.valueOf( preco ) );
	}
	
	private JTextField tfNome;
	private JTextField tfPreco;
	private	JButton ok;
	private	JList<String> lista;
	private	DefaultListModel<String> model;
	private int indexOfProduto = -1;
	
	public TelaProdutos( Controller controle ) {
		this.controle = controle;
		controle.addObservador( this );
		
		setTitle("Prova 3 55PPR");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		initComponents();
	}

	private void initComponents() {
		/**** campos descricao e preco ****/
		JPanel jp1 = new JPanel();
		jp1.setLayout(new GridLayout());
		this.tfNome = new JTextField();
		this.tfPreco = new JTextField();
		jp1.add(new JLabel("Descricao :"));
		jp1.add(tfNome);
		jp1.add(new JLabel("Preco :"));
		jp1.add(tfPreco);
		
		// apenas para ajeitar a posicao dos componentes na tela
		//SpringUtilities.makeCompactGrid(jp1, 2, 2, 3, 3, 3, 3);
		JPanel jp = new JPanel();
		jp.setLayout(new BorderLayout());
		jp.add(jp1, BorderLayout.CENTER);
		
		/**** botao salvar ****/
		JPanel jp2 = new JPanel();
		this.ok = new JButton("Salvar");
		jp2.add(ok);
		ok.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {

				if (indexOfProduto == -1) {
					controle.adicionarProduto( 
						tfNome.getText(), 
						Double.parseDouble( tfPreco.getText() ) 
					);
				} else {
					controle.atualizarProduto(
						tfNome.getText(), 
						Double.parseDouble( tfPreco.getText() ),
						indexOfProduto
					);
					indexOfProduto = -1;
				}
				tfNome.setText("");
				tfPreco.setText("");
		}});
		jp.add(jp2, BorderLayout.SOUTH);
		add(jp, BorderLayout.NORTH);
		
		/**** JList ****/
		this.model = new DefaultListModel<String>();
		this.lista = new JList<String>(this.model);
		this.lista.addMouseListener(new MouseAdapter(){
			
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) { // duplo clique
					indexOfProduto = lista.getSelectedIndex();
					controle.buscarProduto( indexOfProduto );
				}
			}
		});
		add(new JScrollPane(this.lista), BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		TelaProdutos tp = new TelaProdutos( new Controller() );
		tp.setVisible(true);
		}

}
