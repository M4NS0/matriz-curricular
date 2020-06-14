package testes;

import classes.Cadeira;
import classes.Mesa;

public class TesteCadeira {

	public static void main(String[] args) {
		
		Cadeira objCadeira1 = new Cadeira();
		Cadeira objCadeira2 = new Cadeira();
		Mesa objMesa = new Mesa();
		
		// Não acessar diretamente um método *** Errado ***
		objCadeira1.cor = "Azul";
		objCadeira1.modelo = "Confortável";
		objCadeira1.altura = 60;
		objCadeira1.movimentar();
		
		objCadeira2.cor = "Preta";
		objCadeira2.modelo = "Rodas";
		objCadeira2.altura = 85;

		objMesa.movimentar();
		//objMesa.valor = 50;
		objMesa.altura = 1;
		objMesa.largura = 2;
		objMesa.setNumLugares(8);
		
		System.out.println("Dados da Mesa = " 
							+ "Altura: "+ objMesa.altura + " "
							+ "Largura: " + objMesa.largura + " "
							+ "Nº Lugares: " + objMesa.getNumLugares());
	}
}
