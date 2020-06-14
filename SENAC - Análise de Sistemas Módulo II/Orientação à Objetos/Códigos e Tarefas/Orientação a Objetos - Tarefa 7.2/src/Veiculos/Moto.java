package Veiculos;

import Itens.Item;

public class Moto extends Item {
	boolean motor;
	
	

	public Moto(String nome) {
		super(nome);
	}

	public boolean getMotor() {
		return motor;
	}

	public void setMotor(boolean motor) {
		this.motor = motor;
	}
	public void lavar() {
		
	}

	@Override
	public String toString() {
		String lav = "";
		if (motor == true) {
			lav = "Sim";
		}
		if (motor == false) {
			lav = "Não";
		}
		return "\nLava Motos\nNome: " + nome + "\nLavar Motor? " + lav + "\n";
	}
	
}
