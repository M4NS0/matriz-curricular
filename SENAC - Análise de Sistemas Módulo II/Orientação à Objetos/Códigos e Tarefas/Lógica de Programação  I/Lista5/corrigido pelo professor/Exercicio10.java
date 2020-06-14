package Lista5c;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		String numero, sexo, exper;
		int opcao = 1, idade, i = 0, iMasc = 0, iFem = 0, iExpMaiorIdade = 0;
		Scanner leia = new Scanner(System.in);
		float somaIdade = 0, mediaIdade;
		

		while (opcao == 1) {
			i = i + 1; // i++;
			System.out.print("Digite o n� do " + i + "� candidato...........: ");
			numero = leia.next();
			System.out.print("Digite o sexo (M ou F)........................: ");
			sexo = leia.next();
			System.out.print("Digite a idade ...............................: ");
			idade = leia.nextInt();
			System.out.print("Digite se o canditado tem experi�ncia (S ou N): ");
			exper = leia.next();
			System.out.println("------------------------------------------------");
			
			somaIdade = somaIdade + idade;
			
			if (sexo.equalsIgnoreCase("M")) {
				iMasc++; // iMasc = iMasc + 1;
			}
			else {
				iFem++; // iFem = iFem + 1;
			}
			
			if ((idade >= 18) && (exper.equalsIgnoreCase("S"))) {
				iExpMaiorIdade++;
			}
		
			System.out.print("Deseja continuar o cadastro? Digite 1 = Sim ou 2 = N�o: ");
			opcao = leia.nextInt();
			System.out.println("------------------------------------------------");
		}
		
		mediaIdade = somaIdade / i;
		
		System.out.println("------------------------------------------------");
		System.out.println("A m�dia de idade dos canditados................ = " + mediaIdade + " anos");
		System.out.println("Candidatos do sexo Masculino .................. = " + iMasc);
		System.out.println("Candidatas do sexo Feminino ................... = " + iFem);
		System.out.println("Candidatos com Experi�ncia e Maiores de Idade . = " + iExpMaiorIdade);
		System.out.println("Fim do Programa");

	}

}
