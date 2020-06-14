package Veiculos;

import Itens.Item;

public class Carro extends Item {
	boolean motor;
	boolean bancos;
	boolean portaMalas;
	
	public Carro(String nome) {
		super(nome);
	}
		
	public boolean isMotor() {
		return motor;
	}
	public void setMotor(boolean motor) {
		this.motor = motor;
	}
	public boolean isBancos() {
		return bancos;
	}
	public void setBancos(boolean bancos) {
		this.bancos = bancos;
	}
	public boolean isPortaMalas() {
		return portaMalas;
	}
	public void setPortaMalas(boolean portaMalas) {
		this.portaMalas = portaMalas;
	}
	
	public void lavar1() {
		
	}
	public void lavar2() {
		
	}
	public void lavar3() {
		
	}
	@Override
	public String toString() {
		String lavM = "";
		if (motor == true) {
			lavM = "Sim";
		}
		if (motor == false) {
			lavM = "Não";
		}
		String lavB = "";
		if (bancos == true) {
			lavB = "Sim";
		}
		if (bancos == false) {
			lavB = "Não";
		}
		String lavP = "";
		if (portaMalas == true) {
			lavP = "Sim";
		}
		if (portaMalas == false) {
			lavP = "Não";
		}
		return 	"\nLava Carros " +
				"\nMarca: " + nome +
				"\nLavar Motor? " + lavM + 
				"\nLavar Bancos? " + lavB + 
				"\nLavar Porta Malas? " + lavP + "\n";
	}
	
}
