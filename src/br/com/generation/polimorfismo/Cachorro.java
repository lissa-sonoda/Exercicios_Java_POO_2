package br.com.generation.polimorfismo;

public class Cachorro extends Animal implements AnimalSom{
	
	@Override
	public void emitirSom() {
		
		System.out.println("\nO cachorro está latindo: au au... au au...");
		
	}

}
