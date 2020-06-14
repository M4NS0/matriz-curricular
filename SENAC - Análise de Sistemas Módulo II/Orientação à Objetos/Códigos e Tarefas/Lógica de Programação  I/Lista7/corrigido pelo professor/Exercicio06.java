import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		String candidato, op = "N";
		int idade, sexo, contA = 0, contB = 0, contC = 0;
		int contHomemA = 0, contHomemB = 0, contHomemC = 0; 
		float somaA = 0, somaB = 0, somaC = 0, mediaIdade;
		Scanner leia = new Scanner(System.in);
		
		while (!op.equalsIgnoreCase("S")) {
			System.out.print("Digite o candidato escolhido pelo eleitor (A, B ou C)....: ");
			candidato = leia.next();
			System.out.print("Digite o sexo do eleitor (1 = Masculino ou 2 = Feminino).: ");
			sexo = leia.nextInt();
			System.out.print("Digite a idade do eleitor................................: ");
			idade = leia.nextInt();
			
			if (candidato.equalsIgnoreCase("A")) {
				contA++;
				somaA = somaA + idade;
				if (sexo == 1) {
					contHomemA++;
				}
			}
			else if (candidato.equalsIgnoreCase("B")) {
				contB++;
				somaB = somaB + idade;
				if (sexo == 1) {
					contHomemB++;
				}
			}
			else if (candidato.equalsIgnoreCase("C")) {
				contC++;
				somaC = somaC + idade;
				if (sexo == 1) {
					contHomemC++;
				}
			}

			
			System.out.println("Deseja sair do programa? S = Sim ou N = Não: ");
			op = leia.next();
		}
		
		System.out.println("A = " + contA + " voto(s)\tB = " + contB + " voto(s)\tC = " + contC + " voto(s)");
		
		if ((contA > contB) && (contA > contC)) {
			System.out.println("O candidato A foi o mais votado");
			mediaIdade = somaA / contA;
		}
		else if ((contB > contA) && (contB > contC)) {
			System.out.println("O candidato B foi o mais votado");
			mediaIdade = somaB / contB;
		}
		else {
			System.out.println("O candidato C foi o mais votado");
			mediaIdade = somaC / contC;
		}

		System.out.println("A média de idade do candidato mais votado = " + mediaIdade);

		if ((contHomemA > contHomemB) && (contHomemA > contHomemC)) {
			System.out.println("O candidato preferido dos Homens é o candidato A");
		}
		else if ((contHomemB > contHomemA) && (contHomemB > contHomemC)) {
			System.out.println("O candidato preferido dos Homens é o candidato B");
		}
		else {
			System.out.println("O candidato preferido dos Homens é o candidato C");
		}
	}

}
