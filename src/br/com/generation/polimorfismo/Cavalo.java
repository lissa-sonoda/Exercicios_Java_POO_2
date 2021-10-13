package br.com.generation.polimorfismo;

public class Cavalo extends Animal implements AnimalSom{
	
	@Override
	public void emitirSom() {
		
		System.out.println("\nO cavalo está relinchando: hiin iiirrrrin...");
		
	}

}
