package br.com.generation.polimorfismo;

public class Cavalo extends Animal implements AnimalSom{
	
	@Override
	public void emitirSom() {
		
		System.out.println("\nO cavalo est� relinchando: hiin iiirrrrin...");
		
	}

}
