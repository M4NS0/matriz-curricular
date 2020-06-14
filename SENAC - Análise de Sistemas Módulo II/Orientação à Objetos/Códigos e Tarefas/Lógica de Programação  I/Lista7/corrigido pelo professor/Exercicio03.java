import java.text.DecimalFormat;

public class Exercicio03 {

	public static void main(String[] args) {
		
		float valorIngresso = 6.00f, qtdeIngressos = 130.00f;
		float custo = 300.00f, lucro;
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Quantidade\tValor R$\tLucro R$");
		while (valorIngresso >= 1.00f) {
			lucro = (valorIngresso * qtdeIngressos) - custo;
			System.out.println(df.format(qtdeIngressos) 
					+ "\t\t" + df.format(valorIngresso) 
					+ "\t\t" + df.format(lucro));
			valorIngresso = valorIngresso - 0.60f;
			qtdeIngressos = qtdeIngressos + 30;
		}
	}

}
