package Lista1;

//10.   Entrar via teclado com o valor de cinco produtos.
//	Após as entradas, digitar um valor referente ao 
//	pagamento da somatória destes valores. 
//	Calcular e exibir o troco que deverá ser devolvido. 

import java.util.Scanner;

public class Exercicio10 {

		public static void main(String args[]) {

	int p1, p2, p3, p4, p5, som, pag, tro;
	Scanner leia = new Scanner(System.in);
		
	System.out.println("Escreva o valor do primeiro produto: ");
	p1 =  leia.nextInt();

	System.out.println("Escreva o valor do segundo produto: ");
	p2 =  leia.nextInt();

	System.out.println("Escreva o valor do terceiro produto: ");
	p3 =  leia.nextInt();

	System.out.println("Escreva o valor do quarto produto: ");
	p4 =  leia.nextInt();

	System.out.println("Escreva o valor do quinto produto: ");
	p5 =  leia.nextInt();
	
	System.out.println("Escreva o valor do pagamento efetuado: ");
	pag =  leia.nextInt();

	som = p1 + p2 + p3 + p4 + p5;
	tro = pag - som;
	
	System.out.println("A soma dos valores pagos é de: " + som);
	System.out.println("O troco correspondente ao valor total menos o valor pago é de: " + tro);
	
	}
}
