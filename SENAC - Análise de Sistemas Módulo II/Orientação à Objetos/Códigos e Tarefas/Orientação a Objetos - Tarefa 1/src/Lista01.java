import java.util.Scanner;

/*
 
1.Escreva uma função que retorne a data recebida em 3 parâmetros inteiros DD/MM/AAAA 
na forma “DD de Nome do mês de AAAA”.

2.Faça uma função que leia um número não determinado
de valores positivos e retorna a média aritmética dos mesmos.

3.Escreva uma função que verifique se um número é primo. Sua função 
deve retornar verdadeiro ou falso. O parâmetro  de entrada é o número
a ser verificado.
 
4.Escreva uma função que conte o número de espaços em branco em uma 
string passada como parâmetro.
 
5.Escreva uma função que conte o número de consoantes de uma string 
passada como parâmetro.
 
6.Escreva uma função que receba como parâmetro um número inteiro e 
retorne -1, 0 ou 1 se este número for negativo, nulo ou positivo, respectivamente.
 
7.Faça uma função que recebe a média final de um aluno por parãmetro e 
retorna o seu conceito, conforme a tabela abaixo:	
 Nota           Conceito 
 de 0,0 a 4,9	D
 de 5,0 a 6,9	C
 de 7,0 a 8,9	B
 de 9,0 a 10,0	A
 */

public class Lista01 {

	public static int escolha = 1;
	public static String mesExt;
	private static int media;
	private static float mediaAritimetica;
	private static boolean VouF;
	private static int num;
	private static String frase;
	private static int consoantes = 0;

	public static void main(String[] args) {
		menu(escolha, escolha, frase, consoantes);
	}

	public static void menu(int resultado, float mediaFinal, String conceito, int espacos) {
		while (escolha != 0) {

			Scanner leia = new Scanner(System.in);
			System.out.println("\n1 - Para inserir o dia, mês e ano e imprimir a data por extenso"
					+ "\n2 - Insira números positivos e obtenha a média aritmética dos mesmos." // erro
					+ "\n3 - Verifique se um número é primo."
					+ "\n4 - Calcule o número de espaços em brancos que sua frase contêm." // erro
					+ "\n5 - Calcule o número de consoantes de uma  palavra ou frase." // erro
					+ "\n6 - Digite um número inteiro para saber se ele é negativo (-1), nulo (0) ou positivo (+1)"
					+ "\n7 - Digite a media final para saber o conceito do aluno.");

			System.out.println("\nEscolha uma opção:");
			escolha = leia.nextInt();
			if (escolha == 1) {
				int dia;
				int mes;
				int ano;
				System.out.println("Insira o dia de hoje:");
				dia = leia.nextInt();
				if ((dia > 31) || (dia < 0)) {
					System.out.println("Dia Inválido! Insira o dia de hoje:");
					dia = leia.nextInt();
				}
				System.out.println("Insira o mês de hoje (em numerais):");

				mes = leia.nextInt();
				System.out.println("Insira o ano de hoje:");
				ano = leia.nextInt();

				String mesExt = exercicio1(mes);
				System.out.println("\nO dia digitado foi: " + dia + " de " + mesExt + " de " + ano + "\n");
			}

			if (escolha == 2) {
				System.out.println(
						"\nInsira uma sequência de números aleatorios seguidos da tecla <ENTER> por fim digite '0' e "
								+ "<ENTER> para gerar a média aritimética deles:");
				mediaAritimetica = exercicio2(media);
				System.out.println("\nA média aritimética da sequencia de número inserido é: " + mediaAritimetica);
			}

			if (escolha == 3) {
				System.out.println("\nInsira um número: ");
				num = leia.nextInt();
				boolean resposta3 = exercicio3();

				if (resposta3 == false) {
					System.out.println("O número " + num + " não é primo!");
				} else {
					System.out.println("O número " + num + " é primo!");
				}
			}
			if (escolha == 4) {
				System.out.println("\nDigite uma frase: ");
				frase = leia.next();
				int resposta4 = exercicio4(espacos);
				System.out.println("\nA quantidade de espaços na frase é de: " + resposta4);
			}
			if (escolha == 5) {
				System.out.println("\nDigite uma palavra:");
				frase = leia.next();
				int resposta5 = exercicio5(consoantes);
				System.out.println('"' + frase + '"' + " tem " + resposta5 + " consoantes");
			}
			if (escolha == 6) {
				System.out.println("\nDigite um número: ");
				num = leia.nextInt();
				int resposta5 = exercicio6(resultado);
				System.out.println("Resposta:" + resposta5);
			}
			if (escolha == 7) {
				String resposta7 = exercicio7(conceito);
				System.out.println(resposta7);
			}
			if (escolha > 7 & escolha < 1) {
				System.out.println("\nOpção inválida! Digite numerais de 1 a 7");
			}
		}
	}

	private static String exercicio7(String conceito) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Insira a média final: ");
		float mediaFinal = leia.nextFloat();
		if (mediaFinal < 5) {
			conceito = "Aluno Conceito D";
		}
		if (mediaFinal >= 5 && mediaFinal < 7) {
			conceito = "Aluno Conceito C";
		}
		if (mediaFinal >= 7 && mediaFinal < 9) {
			conceito = "Aluno Conceito B";
		}
		if (mediaFinal >= 9 && mediaFinal < 10) {
			conceito = "Aluno Conceito A";
		}
		return conceito;
	}

	private static int exercicio6(int resultado) {
		if (num < 0) {
			resultado = -1;
		}
		if (num == 0) {
			resultado = 0;
		}
		if (num > 0) {
			resultado = 1;
		}
		return resultado;
	}

	private static int exercicio5(int consoantes) {
		for (int i = 0; i < frase.length(); i++) {
			char ch = frase.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				ch = Character.toLowerCase(ch);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				} else {
					consoantes++;
				}
			}
		}
		return consoantes;
	}

	private static int exercicio4(int espacos) {
		int contaEspaco = 0;
		contaEspaco = contaEspaco + frase.length();
		espacos += contaEspaco - 1;
		return espacos;
	}

	private static boolean exercicio3() {
		Scanner leia = new Scanner(System.in);
		if (num <= 0) {
			System.out.println("Número menor que zero, Digite um novo número: ");
			num = leia.nextInt();
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static float exercicio2(float media) {
		Scanner leia = new Scanner(System.in);
		float num;
		int contador = 0;
		int somanum = 0;
		System.out.println("Insira o número #1: ");
		num = leia.nextFloat();

		while (num != 0) {

			while (num < 0) {
				System.out.println("Numero negativo, Insira o #1: ");
				num = leia.nextFloat();
			}
			contador++;
			System.out.println("Insira o #" + (contador + 1) + ":");
			num = (int) leia.nextFloat();
			somanum = (int) (somanum + num);

		}

		return media = somanum / (contador - 1);
	}

	private static String exercicio1(int mes) {
		Scanner leia = new Scanner(System.in);

		String lista[] = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
				"Outubro", "Novembro", "Dezembro" };
		mesExt = lista[mes - 1];
		return mesExt;
		/*
		 * 
		 * if (mes == 1) { mesExt = "Janeiro"; } if (mes == 2) { mesExt = "Fevereiro"; }
		 * if (mes == 3) { mesExt = "Março"; } if (mes == 4) { mesExt = "Abril"; } if
		 * (mes == 5) { mesExt = "Maio"; } if (mes == 6){ mesExt = "junho"; } if (mes ==
		 * 7) { mesExt = "Julho"; } if (mes == 8) { mesExt = "Agosto"; } if (mes == 9) {
		 * mesExt = "Setembro"; } if (mes == 10) { mesExt = "Outubro"; } if (mes == 11)
		 * { mesExt = "Novembro"; } if (mes == 12) { mesExt = "Dezembro"; } return
		 * (mesExt);
		 */
	}
}
