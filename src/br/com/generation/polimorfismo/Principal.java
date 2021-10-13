package br.com.generation.polimorfismo;

public class Principal {

	public static void main(String[] args) {
		
		TesteGeral a = new TesteGeral();
		
		a.fazerSom(new Cachorro());
		a.fazerSom(new Cavalo());
		a.fazerSom(new Preguica());

	}

}
