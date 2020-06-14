package Lista5c;

import java.util.Scanner;

public class Exercicio01C {

	public static void main(String[] args) {
		
		String nome = "", endereco, cidade, uf, cep, telefone;
		String cpf, rg, dataNasc, grau, curso;
		Scanner leia = new Scanner(System.in);
		int quant, i = 1;
		
		System.out.print("Digite quantos professores deseja cadastrar.........: ");
		quant = leia.nextInt();

		while (i <= quant) {
			System.out.print("Digite o " + i + "� nome do professor.................: ");
			nome = leia.next();
			System.out.print("Digite o CPF........................................: ");
			cpf = leia.next();
			System.out.print("Digite o RG.........................................: ");
			rg = leia.next();
			System.out.print("Digite o endere�o...................................: ");
			endereco = leia.next();
			System.out.print("Digite a cidade.....................................: ");
			cidade = leia.next();
			System.out.print("Digite o UF.........................................: ");
			uf = leia.next();
			System.out.print("Digite o CEP........................................: ");
			cep = leia.next();
			System.out.print("Digite o telefone...................................: ");
			telefone = leia.next();
			System.out.print("Digite a data de nascimento.........................: ");
			dataNasc = leia.next();
			System.out.print("Digite O Grau de Escolaridade.......................: ");
			grau = leia.next();
			System.out.print("Digite o Curso em que se formou.....................: ");
			curso = leia.next();
	
			System.out.println("\nNome do professor....: " + nome);
			System.out.println("CPF .................: " + cpf);
			System.out.println("RG ..................: " + rg);
			System.out.println("Endere�o ............: " + endereco);
			System.out.println("Cidade ..............: " + cidade);
			System.out.println("UF ..................: " + uf);
			System.out.println("CEP .................: " + cep);
			System.out.println("Telefone ............: " + telefone);
			System.out.println("Data de nascimento...: " + dataNasc);
			System.out.println("Grau de escolaridade.: " + grau);
			System.out.println("Curso ...............: " + curso);
		
			i++;
		}
		System.out.println("Fim do Programa");

	}

}
