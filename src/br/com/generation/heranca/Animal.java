package br.com.generation.heranca;

import javax.swing.JOptionPane;

public class Animal {
	
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void emitirSom(String som) {
		JOptionPane.showMessageDialog(null, "O animal está emitindo um som...  " + som,
				"Aviso", JOptionPane.INFORMATION_MESSAGE);
	}

}
