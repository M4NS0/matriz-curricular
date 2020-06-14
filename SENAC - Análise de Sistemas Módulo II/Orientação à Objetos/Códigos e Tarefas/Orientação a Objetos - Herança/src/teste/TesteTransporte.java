package teste;

import adequado.Barco;
import adequado.Carro;
import adequado.Moto;

public class TesteTransporte {

	public static void main(String[] args) {

		Carro c1 = new Carro();
		
		c1.setAnoFab(2015);
		c1.setCor("Verde");
		c1.setNomeProprietario("Joao");
		c1.setCapacidadeMaxima(5);
		c1.setNumPortas(4);
		c1.setTetoSolar(true);
		c1.setNumRodas(4);
		System.out.println(c1);
		c1.imprimirTeste();
		
		Moto m1 = new Moto();
		m1.setAnoFab(2019);
		m1.setCor("Vermelha");
		m1.setNomeProprietario("Maria");
		m1.setCapacidadeMaxima(2);
		m1.setNumRodas(2);
		System.out.println(m1);
		
		Barco b1 = new Barco();
		b1.setNumAndares(2);
		System.out.println(b1);
	}

}
