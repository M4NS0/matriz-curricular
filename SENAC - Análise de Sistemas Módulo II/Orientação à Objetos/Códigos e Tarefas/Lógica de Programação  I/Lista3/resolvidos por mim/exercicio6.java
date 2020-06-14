package Lista3;
import java.util.Scanner;
public class exercicio6 {

	public static void main(String args[]) {
	Scanner leia = new Scanner(System.in);

	System.out.print("\n\tO programa a seguir, resolve o seguinte problema:\n\tUma empresa da um premio aos funcionarios que cumprem ou \n\tultrapassam determinado valor de vendas de produtos.\n\tA cada funcionario foi estabelecido um valor a ser alcançado.\n\tFaça um algoritmo para ler o valor fixado e o valor \n\tde vendas de um funcionario , e imprimir a mensagem \n\t\"Ganhou! :D\", se o funcionario tiver conseguido o premio e \"Nao Ganhou :(\", se nao tiver conseguido.");
	
	String nome;
	float valorfixado, valorvendas;

	System.out.print("\n\n\tDigite o seu nome: ");
	nome = leia.nextLine();
	
	System.out.print("\n\tDigite o valor Fixado: ");
	valorfixado = leia.nextFloat();
	
	System.out.print("\n\tDigite o valor total das suas vendas: ");
	valorvendas = leia.nextFloat();
	
		if (valorvendas > valorfixado) {
			System.out.print("\n\t" + nome  + "...Voce Ganhou! :D ");
		} else if (valorvendas < valorfixado) {
			System.out.print("\n\t" + nome  + ", Voce nao Ganhou! 8( ");
			
		}
	}
}
