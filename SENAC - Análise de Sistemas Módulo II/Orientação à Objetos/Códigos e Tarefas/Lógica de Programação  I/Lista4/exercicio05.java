package Lista4;
import java.util.Scanner;

public class exercicio05 {
	
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	System.out.print("\n\t\tEntrar com o peso, o sexo e a altura de uma determinada pessoa" + 
	 "\n\t\tApós a digitação, exibir se esta pessoa está ou não com seu peso ideal.");
	
	float peso, altura, imc;
	String nome, sexo;
		
	System.out.print("\n\n\t\tDigite o nome da pessoa: ");
	nome = leia.nextLine();
	
	System.out.print("\n\t\tDigite o sexo de " + nome + " : ");
	sexo = leia.nextLine();
	
	System.out.print("\n\t\tDigite o peso de " + nome + " : ");
	peso = leia.nextFloat();
	
	System.out.print("\n\t\tDigite a altura de " + nome + " : ");
	altura = leia.nextFloat();
	
	imc = peso/ (altura * altura);
	
	if (sexo == "feminino") {
	} else if (imc < 19) { 
			System.out.print("\n\t\t" + nome + " esta abaixo do peso!");
		} else if ((19 <= imc) && (imc < 24)) {
			System.out.print("\n\t\t" + nome + " esta no peso ideal!");
		} else if (imc >= 24) {
			System.out.print("\n\t\t" + nome + " esta acima do peso!");	
	
	
		} else if (sexo == "masculino") {
		} else if (imc < 20) { 
			System.out.print("\n\t\t" + nome + " esta abaixo do peso!");
		} else if ((20 <= imc) && (imc < 25)) {
			System.out.print("\t\t" + nome + " esta no peso ideal!");
		} else if (imc >= 25) {
			System.out.print("\n\t\t" + nome + " esta acima do peso!");	
					}
				}
			}
		
	

	