package Lista5c;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		String num, qualidade, numPecasRep = "";
		int cont = 1, contAp = 0, contRep = 0;
		final int MAX = 6;
		Scanner leia = new Scanner(System.in);

		while (cont <= MAX) {
			System.out.print("Digite a n�mero da " + cont + "� pe�a: ");
			num = leia.next();
			System.out.print("Digite se a pe�a foi A = Aprovada ou R = Reprovado: ");
			qualidade = leia.next();

			if (qualidade.equals("A")) {
				contAp = contAp + 1; // contAp++;
			} else {
				numPecasRep = numPecasRep + num + ", " ; // concatena��o = uni�o de strings
				contRep++; // contRep = contRep + 1;
			}
			cont = cont + 1;
		}

		System.out.println("Pe�as Aprovadas  = " + contAp);
		System.out.println("Pe�as Reprovados = " + contRep);
		System.out.println("N� das pe�as reprovadas " + numPecasRep);
	}

}
