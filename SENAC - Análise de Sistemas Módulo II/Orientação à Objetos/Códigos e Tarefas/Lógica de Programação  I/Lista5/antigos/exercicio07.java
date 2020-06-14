package Lista5;
import java.util.Scanner;
public class exercicio07 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
	
		System.out.println("\n\tNa declaração de imposto de renda devem constar os dados:"
				+ "\n\tnome do contribuinte, CPF, renda anual e número de dependentes."
				+ "\n\tOs cálculos são feitos da forma a seguir:\n"
				+ "\n\ta) Desconto de R$ 110,00 por dependente."
				+ "\n\tb) Com base na renda líquida (renda anual menos desconto)"
				+ "\n\té calculada a alíquota de contribuição de acordo com a tabela:\n"
				+ "\n\tRenda Liquida\t\t\t\tAliquota(%)"
				+ "\n\tAté R$ 900,00 \t\t\t\tIsento"
				+ "\n\tDe R$ 900,01 até R$ 5.000,00 \t\t5%"
				+ "\n\tDe R$ 5.000,01 até R$ 10.000,00 \t10%"
				+ "\n\tAcima de R$ 10.000,01 \t\t\t15%");
		
	String nome,cpf;
	int i = 0,cadastros,dependentes;
	double renda;
	
	System.out.println("\nInsira a quantidade de cadastros a registrar: ");
	cadastros = leia.nextInt();
	
	while (i<cadastros) {
		
	System.out.println("\nInsira o nome do contribuinte: ");
	nome = leia.next();
		
	System.out.println("\nInsira o C.P.F do contribuinte: ");
	cpf = leia.next();
		
	System.out.print("\nInsira a renda do contribuinte: ");
	renda = leia.nextDouble();
		
	System.out.print("\nInsira a quantidade de dependentes do contribuinte: ");
	dependentes = leia.nextInt();
	
	double desconto;
	desconto = dependentes*110;
	
	double rendaliquida;
	rendaliquida = renda - desconto;
	
	double aliquota;
	aliquota = 0.0;
	
	double total;
			
	System.out.println("\nNome: " + nome );
	System.out.println("CPF: " + cpf );
	System.out.println("Renda: " + renda + " (anual)");
	System.out.println("No de Dependentes: " + dependentes );
	
	if (rendaliquida<=900) {
		System.out.println("Imposto a declarar: Isento.");
	
	} else if ((rendaliquida>900.00) && (rendaliquida<=5000.00)) {
		aliquota = 5/100; 
		total = rendaliquida - (rendaliquida * aliquota);
		System.out.println("Imposto a declarar: " + total);		
	
	} else if ((rendaliquida>5000.00) && (rendaliquida<=10000.01)) {
		aliquota = 10/100; 
		total = rendaliquida - (rendaliquida * aliquota);
		System.out.println("Imposto a declarar: " + total);	
		
	} else if (rendaliquida>10000.00) {
		aliquota = 15/100; 
		total = rendaliquida - (rendaliquida * aliquota);
		System.out.println("Imposto a declarar: " + total);	
	}
	i ++;
	}
	}
}