package view;

import javax.swing.JOptionPane;

import model.Observador;

public class MostrarEmJOP implements Observador {
	
	private String nome;
	
	public MostrarEmJOP(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public void setQuantidadeAtual(int quantidade) {
		JOptionPane.showMessageDialog(null, nome + "\nValor atual: " + String.valueOf( quantidade ) );
	}

	@Override
	public void setQuantidadeAdicionada(int quantidade) {
		JOptionPane.showMessageDialog(null, nome + "\nValor adicionado: " + String.valueOf( quantidade ) );
	}

	@Override
	public void setQuantidadeRetirada(int quantidade) {
		JOptionPane.showMessageDialog(null, nome + "\nValor retirado: " + String.valueOf( quantidade ) );
	}

}
