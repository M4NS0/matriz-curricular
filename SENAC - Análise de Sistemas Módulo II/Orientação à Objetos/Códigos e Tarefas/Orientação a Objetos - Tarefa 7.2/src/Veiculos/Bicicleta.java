package Veiculos;

import Itens.Item;

public class Bicicleta extends Item {

	public Bicicleta(String nome) {
		super(nome);
		
	}

	@Override
	public String toString() {
		return "\nLava Bicicletas \nNome: " + nome + "\n";
	}
	
}
