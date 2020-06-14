package lista5;
import java.util.Scanner;
public class e10 {
public static void main (String args[]) {
	Scanner leia = new Scanner(System.in);
	
	String iniciar, matricula, sexo, exp;
	int idade;
	int mulher = 0;
	int homem = 0;
	int comExp = 0;
	int semExp = 0;
	float mediaIdade = 0;
	int somaIdade = 0;
	int totalcandidatosas = 0;
	int aptos = 0;
	int aptas = 0;
	
	
	System.out.println("Para parar os cadastros digite 'P' para continuar digite 'C': ");
	iniciar = leia.nextLine();
	
	while (!iniciar.equalsIgnoreCase("P")) {
		System.out.println("\nMATRICULA No:");
		matricula =  leia.nextLine();
		
		System.out.println("IDADE: ");
		idade = leia.nextInt();
		
		System.out.println("SEXO 'M' ou 'H': ");
		sexo = leia.next();
		
		if (sexo.equalsIgnoreCase("M")) {
			mulher ++;
		}
		if (sexo.equalsIgnoreCase("H")) {
			homem ++;
		}
		
		System.out.println("COM EXP 'S' ou SEM EXP 'N' ");
		exp = leia.next();
		
		if (exp.equalsIgnoreCase("S")) {
			comExp ++;
		}
		if (sexo.equalsIgnoreCase("H")) {
			semExp ++;
		}
		somaIdade = somaIdade + idade;
		totalcandidatosas = homem + mulher;
		mediaIdade = somaIdade / totalcandidatosas;
		
		if (idade >=21 && sexo.equalsIgnoreCase("M") && (exp.equalsIgnoreCase("S"))) {
			aptas ++;
		}
		if (idade >=21 && sexo.equalsIgnoreCase("H") && (exp.equalsIgnoreCase("S"))) {
			aptos ++;
		}	
		System.out.println("Para parar os cadastros digite 'P' para continuar digite 'C': ");
		iniciar = leia.next();
		
	}
	System.out.println("\n\tIDADE MEDIA: " + mediaIdade
			+ "\n\tNUMERO TOTAL: " + totalcandidatosas
			+ "\n\tAPTAS: " + aptas
			+ "\n\tAPTOS: "+ aptos);
	
}
}
