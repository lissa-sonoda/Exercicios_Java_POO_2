package br.com.generation.heranca;

import javax.swing.JOptionPane;

public class Preguica extends Animal {
	
	private double altura = 0;
	
		public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void subirArvore() {
		JOptionPane.showMessageDialog(null, "A preguiça está subindo na árvore...",
				"Aviso", JOptionPane.INFORMATION_MESSAGE);
	}

}
