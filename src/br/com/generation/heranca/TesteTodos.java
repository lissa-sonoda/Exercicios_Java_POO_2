package br.com.generation.heranca;

import javax.swing.JOptionPane;

public class TesteTodos {

	public static void main(String[] args) {
		
		Cavalo cav1 = new Cavalo();
		Cachorro cach1 = new Cachorro();
		Preguica preg1 = new Preguica();
		
		cav1.setNome(JOptionPane.showInputDialog("Digite o nome do cavalo: "));
		cav1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cavalo: ")));
		cav1.setVelocidade(Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade do cavalo: ")));
		
		cach1.setNome(JOptionPane.showInputDialog("Digite o nome do cachorro: "));
		cach1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cachorro: ")));
		cach1.setVelocidade(Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade do cachorro: ")));
		
		preg1.setNome(JOptionPane.showInputDialog("Digite o nome da preguiça: "));
		preg1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da preguiça: ")));
		preg1.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura que a preguiça se encontra: ")));
		
		cav1.emitirSom("Hiin iiirrrrin");
		cav1.correr();
		JOptionPane.showMessageDialog(null, "Dados do cavalo: \n\n" + 
										"Nome: " + cav1.getNome() + 
										"\nIdade: " + cav1.getIdade() + 
										"\nVelocidade: " + cav1.getVelocidade(), "Aviso",
										JOptionPane.INFORMATION_MESSAGE);
		
		cach1.emitirSom("Au au");
		cach1.correr();
		JOptionPane.showMessageDialog(null, "Dados do cachorro: \n\n" + 
										"Nome: " + cach1.getNome() + 
										"\nIdade: " + cach1.getIdade() + 
										"\nVelocidade: " + cach1.getVelocidade(), "Aviso",
										JOptionPane.INFORMATION_MESSAGE);
		
		preg1.emitirSom("Aaaah");
		preg1.subirArvore();
		JOptionPane.showMessageDialog(null, "Dados da preguiça: \n\n" + 
										"Nome: " + preg1.getNome() + 
										"\nIdade: " + preg1.getIdade() + 
										"\nAltura: " + preg1.getAltura(), "Aviso",
										JOptionPane.INFORMATION_MESSAGE);
		
	}
}
