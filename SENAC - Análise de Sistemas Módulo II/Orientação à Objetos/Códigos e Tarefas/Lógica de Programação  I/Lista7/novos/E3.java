package Lista7;
import java.text.DecimalFormat;
import java.util.Scanner;
public class E3 {
	public static void main(String args [] ) {
		Scanner leia = new Scanner(System.in);
		
		float valor = 6.0f;
		
		float contador = 0;
		int vendidos = 130;
		float despesas = 300.0f;
		float lucro;
		DecimalFormat saida = new DecimalFormat("0.0");
		
		lucro = (vendidos*valor) - despesas;
		System.out.println("Ingressos a 6,0R$ > " + saida.format(lucro) + "R$ de lucro");
		
		for (contador = 5.4f; contador >= 1.0f; contador = (contador - 0.6f)) {
			vendidos = vendidos + 30;
			lucro = (vendidos * contador) - despesas;
			System.out.println("Ingressos a " + saida.format(contador) + "R$ > " +saida.format(lucro) + "R$ de lucro");
		}
	}
}
