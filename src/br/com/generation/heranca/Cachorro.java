package br.com.generation.heranca;

import javax.swing.JOptionPane;

public class Cachorro extends Animal{
	
	private double velocidade;
	
	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public void correr() {
		JOptionPane.showMessageDialog(null, "O cachorro está correndo...",
				"Aviso", JOptionPane.INFORMATION_MESSAGE);
	}

}
