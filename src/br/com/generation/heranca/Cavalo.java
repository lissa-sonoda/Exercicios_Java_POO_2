package br.com.generation.heranca;

import javax.swing.JOptionPane;

public class Cavalo extends Animal{
	
	private double velocidade;
	
	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public void correr() {
		JOptionPane.showMessageDialog(null, "O cavalo est� correndo...",
				"Aviso", JOptionPane.INFORMATION_MESSAGE);
	}

}
