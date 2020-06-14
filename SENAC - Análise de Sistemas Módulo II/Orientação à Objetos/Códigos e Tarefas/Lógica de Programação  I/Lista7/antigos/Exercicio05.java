package Lista7;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		System.out.println("\n\n\nFoi feita uma pesquisa para determinar o índice de mortalidade infantil"
				+ "\nem um certo período. Fazer um algoritmo que: "
				+ "\n\n\t• leia inicialmente o número de crianças nascidas no período; "
				+ "\n\t• leia, em seguida, um número indeterminado de linhas, contendo, cada uma, "
				+ "\n\to sexo de uma criança morta (masculino, feminino) e o número de meses de "
				+ "\n\tvida da criança. A última linha (que identificará o final da entrada de dados)"
				+ "\n\tconterá a palavra “vazio” no lugar do sexo. "
				+ "\n\t• Determine e imprima: \n\n\ta) a porcentagem de crianças mortas no período;"
				+ "\n\tb) a porcentagem de crianças do sexo masculino mortas no período; "
				+ "\n\tc) a porcentagem de crianças que viveram 24 meses ou menos no período. ");

		int meses, nascidas, cadastro, mesesdevida, masc, fem, somaM, 
		somaF,totalMortos, mMortos, fMortas, porcentualMortos,
		porcentualMMortos, menos24,percentualMenos24;
		
		String sexo;

		masc = 0;
		fem = 0;
		somaM = 0;
		somaF = 0;
		totalMortos = 0;
		mMortos = 0;
		fMortas = 0;
		menos24 = 0;
		System.out.println("\n> Insira o periodo (em meses): ");
		meses = leia.nextInt();

		System.out.println("\n> Insira a quantidade de crianças nascidas em " + meses + " meses: ");
		nascidas = leia.nextInt();

		for (cadastro = 1; cadastro <= meses; cadastro++) {
			System.out.println("\n> Recem nascido #" + cadastro + ", M ou F:");
			sexo = leia.next();

			System.out.println("> Insira quantos meses de vida (em meses) teve o recem nascido: ");
			mesesdevida = leia.nextInt();

			if (sexo.equalsIgnoreCase("m")) {
				masc++;
			}
			if (sexo.equalsIgnoreCase("f")) {
				fem++;
			}

			somaM = somaM + masc;
			somaF = somaF + fem;

			if (mesesdevida < meses) {
				totalMortos++;
			}
			if ((mesesdevida < meses) && (sexo.equalsIgnoreCase("m"))) {
				mMortos++;
			}
			if ((mesesdevida < meses) && (sexo.equalsIgnoreCase("f"))) {
				fMortas++;
			}

			if (mesesdevida > meses) {
			}

			totalMortos = fMortas + mMortos;
			porcentualMMortos = (mMortos * 100) / totalMortos;
			porcentualMortos = (totalMortos * 100) / (somaF + somaM);

			if (mesesdevida <= 24) {
				menos24++;
			}
			if (cadastro == nascidas) {
				cadastro = cadastro + 1;
				percentualMenos24 = (menos24 * 100) / totalMortos;
				
				System.out.println("\n> Recem nascido #" + cadastro + ", M ou F:\n> <vazio>");
				
				System.out.println("\n\t------------------------------- [Resultados] ------------------------------- ");
				System.out.println("\n\tA porcentagem de mortalidade infantil no periodo de " + meses + " é de: " + porcentualMortos + "%");
				System.out.println("\tA porcentagem de crianças do sexo masculino mortas no período é de: "	+ porcentualMMortos + "%");
				System.out.println("\tA porcentagem de crianças que viveram 24 meses ou menos no período é de: " + percentualMenos24 + "%");
				break;
			}
		}
	}
}
