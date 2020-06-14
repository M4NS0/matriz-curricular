package Lista1;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
	
		//Declaracao de Variaveis
		//String = literal
		String nome, endereco, email, fone;
		Scanner leia = new Scanner(System.in);
		
		//Leitura de Dados
		//system out print = escreva
		System.out.print("Digite o nome da pessoa: ");
		//leia.next() = leia
		// = atribuicao <-
		nome = leia.nextLine();
		
		System.out.print("Digite o endereco da pessoa: ");
		endereco = leia.next();
		
		System.out.print("Digite o email da pessoa: ");
		email = leia.next();
		
		System.out.print("Digite o fone da pessoa: ");
		fone = leia.next();
		
		//impressao de dados
		System.out.println("o nome digitado foi: " + nome);
		System.out.println("o endereco digitado foi: " + endereco);
		System.out.println("o email digitado foi: " + email);
		System.out.println("o fone digitado foi: " + fone);
				
	}

}
