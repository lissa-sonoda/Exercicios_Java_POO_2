package br.com.generation.polimorfismo;

public class Preguica extends Animal implements AnimalSom{
	
	@Override
	public void emitirSom() {
		
		System.out.println("\nA pregui?a est? fazendo o som: Aaaaaaah Aaaaah...");
		
	}

}
