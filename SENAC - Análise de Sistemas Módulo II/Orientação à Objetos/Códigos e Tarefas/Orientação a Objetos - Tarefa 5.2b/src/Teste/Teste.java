package Teste;
import SerHumano.Pessoa;
import ClasseSocial.*;

public class Teste {
	public static void main (String [] args) {
		
		Miseravel miseravel1 = new Miseravel("Pedro", 33);
		System.out.println(miseravel1);
		
		Pobre pobre1 = new Pobre("Francisco", 22);
		System.out.println(pobre1);
		
		Rico rico1 = new Rico("Abraham", 55);
		System.out.println(rico1);
		
	}
}
