package Lista5;
import java.util.Scanner;
public class exercicio10 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\tUma empresa decidiu fazer um recrutamento para preencher algumas vagas."
				+ "\n\tOs candidatos serão cadastrados por computador. Faça um algoritmo para: "
				+ "\n\n\ta) Ler o número do candidato, a idade, o sexo, a experiência profissional (Sim/Não);"
				+ "\n\tb) Mostrar a idade média dos candidatos;"
				+ "\n\tc) mostrar o número total de candidatos e candidatas;"
				+ "\n\td) mostrar os candidatos (homens e mulheres) maiores de idade que tenham experiência no serviço.");

		int sexo,i,numerocandidato,candidatostotais,idade,total,idadetotal,somaidade,maioridade,menoridade,homem,mulher,experiencia,experienciamaioridade,comxp,semxp,idademedia;
		
		i = 0;
		homem = 0;
		mulher = 0;
		comxp = 0;
		semxp = 0;
		maioridade = 0;
		menoridade = 0;
		total = 0;		
		somaidade = 0;
		experienciamaioridade = 0;
		
		while (i<3) {
		System.out.println("\nDigite o numero de matricula do candidato: ");
		numerocandidato = leia.nextInt();
		
		total ++;
		
		System.out.println("Digite a idade do candidato de numero " + numerocandidato + ": ");
		idade = leia.nextInt();
		
		somaidade = idade * total;
				
			if (idade >= 18) {
				maioridade ++;
			} if (idade<18) {
				menoridade ++;
			}
			System.out.println("Se o candidato numero " + numerocandidato + " for mulher digite: \"1\" se for homem: digite \"2\" ");
			sexo = leia.nextInt();
			
			if (sexo == 1) {
				mulher ++;
			} if (sexo ==2) {
				homem ++;
			}
		System.out.println("Se o candidato numero " + numerocandidato + " tiver experiencia digite: \"1\" se não, digite: \"2\" ");
		experiencia = leia.nextInt();
		
		if (experiencia == 1 ) {
			comxp ++;
		} if (experiencia == 2){
			semxp ++;
					
		}
	
		idademedia = somaidade/(homem + mulher);
		
		
		System.out.println("\n\t\tIdade média dos candidatos: " + idademedia
		+ "\n\t\tQuantidade de homens: " + homem
		+ "\n\t\tQuantidade de mulheres: " + mulher
		+ "\n\t\tCandidatos maiores de idade: " + maioridade
		+ "\n\t\tCandidatos menores de idade: " + menoridade
		+ "\n\t\tCandidatos com Experiência: " + comxp
		+ "\n\t\tCandidatos sem Experiência: " + semxp);
		
		
		if ((comxp == 1) & (idade >= 18)){
			experienciamaioridade ++;
			System.out.println("\n\t\tCom Experiencia e Maior de Idade: " + experienciamaioridade);
		
		}
				
		}
		
	}

}
