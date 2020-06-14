package Lista7;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		System.out.println("\n\n\n\n\tUm cinema possui capacidade de 100 lugares e está sempre"
				+ "\n\tcom ocupação total. Certo dia, cada espectador  respondeu a "
				+ "\n\tum questionário, no qual constava:\n" + "\n\t• Sua idade; "
				+ "\n\t• Sua opinião em relação ao filme, segundo as seguintes notas:\n"
				+ "\n\tA\tOtimo\n\tB\tBom\n\tC\tRegular\n\tD\tRuim\n\tE\tPéssimo\n"
				+ "\n\tElabore um algoritmo que, lendo estes dados, calcule e imprima:\n"
				+ "\n\t• A quantidade de respostas ótima; "
				+ "\n\t• A diferença percentual entre respostas bom e regular; "
				+ "\n\t• A média de idade das pessoas que respondeu ruim; "
				+ "\n\t• A percentagem de respostas péssimo e a maior idade que utilizou esta opção; "
				+ "\n\t• A diferença de idade entre a maior idade que respondeu ótimo e a maior idade que respondeu ruim. \n\n");

		int idade, cadastro;
		int memorizaA = 0, memorizaB = 0, memorizaC = 0, memorizaD = 0, memorizaE = 0;
		float memorizaIdadesD = 0, memorizaIdadesE = 0, memorizaIdadesA = 0, memorizaIdadesB = 0;
		float mediaIdadeD;
		float maiorIdadeE = 0, maiorIdadeA = 0, maiorIdadeD = 0;
		float percentA = 0, percentB = 0, percentC = 0, percentD = 0, percentE = 0;
		float diferencaBeC, diferencaAeD;
		String resposta;

		// max deve ser definido como 100, pois sao 100 lugares,
		// porem,para testes define a menor quantidade possivel
		final int MAX = 7;

		// o vetor roda enquanto existir cadastros vazios,
		// no caso o numero de cadastros é definido em MAX
		for (cadastro = 0; cadastro < MAX; cadastro++) {

			System.out.println("\n\nOlá! Por favor, digite sua idade: ");
			idade = leia.nextInt();

			System.out.println("Agora, dê sua opinião sobre o filme que deseja ver seguindo a tabela abaixo. "
					+ "\n\nA\tOtimo\nB\tBom\nC\tRegular\nD\tRuim\nE\tPéssimo");
			resposta = leia.next();

			// memoriza a quantidade de respostas em cada letra
			// equalsIgnoreCase ignora se a pessoa digitar minuscula

			// memoriza quantidade de "otimos"
			if (resposta.equalsIgnoreCase("A")) {
				memorizaA++;
				// memoriza maior idade de quem achou Otimo
				memorizaIdadesA = memorizaIdadesA + idade;
				if (idade > maiorIdadeA) {
					maiorIdadeA = idade;
				}
			}
			if (resposta.equalsIgnoreCase("B")) {
				memorizaB++;
			}
			if (resposta.equalsIgnoreCase("C")) {
				memorizaC++;
			}
			if (resposta.equalsIgnoreCase("D")) {
				memorizaD++;

				// somando o total das idades das pessoas que responderam "Ruim"
				memorizaIdadesD = memorizaIdadesD + idade;
				if (idade > maiorIdadeD) {
					maiorIdadeD = idade;
				}
			}
			if (resposta.equalsIgnoreCase("E")) {
				memorizaE++;

				// memoriza maior idade de quem achou Pessimo
				memorizaIdadesE = memorizaIdadesE + idade;
				if (idade > maiorIdadeE) {
					maiorIdadeE = idade;
				}
			}
		}
		
		// achando o percentual de "B"
		percentB = (memorizaB * 100) / (memorizaB + memorizaC);

		// achando o percentual de "C"
		percentC = (memorizaC * 100) / (memorizaB + memorizaC);

		// A diferença percentual entre respostas "B" e "C"
		diferencaBeC = percentC - percentB;

		// se o numero retornar negativo, imprimir apenas o absoluto (positivo)
		Math.abs(diferencaBeC); // nao funcionou!

		// fazendo medias das idades das pessoas que responderam "Ruim"
		mediaIdadeD = memorizaIdadesD / memorizaD; // bugou ao fazer media

		// fazendo diferenças ebtre as idades entre "A" e "D"
		diferencaAeD = maiorIdadeA - maiorIdadeD;

		// se o numero retornar negativo, imprimir apenas o absoluto (positivo)
		Math.abs(diferencaAeD); // nao funcionou!

		System.out.println("\n--------------------------------------------------- Relatório ---------------------------------------------------");
		System.out.println("\nA quantidade de respostas 'A': " + memorizaA);
		System.out.println("\nA diferença percentual entre respostas 'B' e 'C': " + diferencaBeC + "%");
		System.out.println("\nA média de idade das pessoas que respondeu 'D': + " + mediaIdadeD);
		System.out.println("\nA diferença de idade entre a maior idade que respondeu 'A' e a maior idade que respondeu 'D': "	+ diferencaAeD);
	}
}
