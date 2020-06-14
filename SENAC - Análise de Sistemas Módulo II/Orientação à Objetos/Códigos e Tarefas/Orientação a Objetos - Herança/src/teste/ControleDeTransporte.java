package teste;

import java.util.ArrayList;

import adequado.Carro;
import adequado.Moto;
import adequado.Transporte;
import adequado.Barco;

public class ControleDeTransporte {

	public static void main(String[] args) {

		ArrayList<Transporte> listaTransp = new ArrayList<Transporte>();
		
		Moto m1 = new Moto();
		Carro c1 = new Carro();
		Barco b1 = new Barco();

		listaTransp.add(m1);
		listaTransp.add(c1);
		listaTransp.add(b1);
	}

}
