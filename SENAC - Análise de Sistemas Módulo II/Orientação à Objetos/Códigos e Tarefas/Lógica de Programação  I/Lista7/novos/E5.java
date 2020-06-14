package Lista7;

import java.util.Scanner;

public class E5 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		int nascimentos;
		int mulheresf = 0;
		int homensf = 0;
		String sexo, escolha;
		int cadastros;
		int mesesdevida;
		int mortas = 0;
		float porcentagemtotal, porcentagemhomem, porcentagemmenos24;
		int menos24 = 0;
		int vivas = 0;

		System.out.println("\n\n\nInsira o numero de crianças nascidas: ");
		nascimentos = leia.nextInt();

		for (cadastros = 1; cadastros <= nascimentos; cadastros++) {

			System.out.println(
					"Digite 'V' se a #" + cadastros + " criança está viva, ou 'F' se caso ela ja tenha falecido");
			escolha = leia.next();

			if (escolha.equalsIgnoreCase("V")) {
				System.out.println("[OK] \n");
				vivas++;
			}

			if (escolha.equalsIgnoreCase("F")) {
				mortas++;
				System.out.println(
						"Insira o sexo da #" + cadastros + " criança falecida, 'M' para mulher, 'H' para homem:  ");
				sexo = leia.next();

				if (sexo.equalsIgnoreCase("M")) {
					mulheresf++;
				}
				if (sexo.equalsIgnoreCase("H")) {
					homensf++;
				}
				System.out.println("Insira os meses de vida da criança #" + cadastros);
				mesesdevida = leia.nextInt();

				if (mesesdevida <= 24) {
					menos24++;
				}
			}
		}
		porcentagemtotal = (mortas * 100) / (vivas + mortas);
		porcentagemhomem = (homensf * 100) / (vivas + mortas);
		porcentagemmenos24 = (menos24 * 100) / mortas;
		System.out.println("\n\tMorreram " + mortas + " crianças nesse periodo,\n\t" + porcentagemtotal
				+ "% no total das crianças cadastradas\n\t" + porcentagemhomem + "% eram homens\n\t" + porcentagemmenos24
				+ "% morreram com menos de 24 mêses");
	}
}
