package Lista5;
import java.util.Scanner;
public class exercicio01 {
	
	public static void main(String args[]) {
	Scanner leia = new Scanner(System.in);
	
	System.out.println("\n\tCadastrar e imprimir os dados de vários professores de um sistema de administração escolar:"
			+"\n\tnome, endereço, cidade, UF, CEP, telefone, CPF, RG," 
			+"\n\tdata de nascimento, grau de escolaridade, curso em que se formou.");
	
	String nome, endereco, cidade, uf, curso, cep, telefone, cpf, nasc, escolaridade, rg;
	float i, cadastros;
	
	System.out.println("\nDigite o número total de professores a cadastrar: ");
	cadastros = leia.nextFloat();
	
	i = 0;
	while (i < cadastros) {
	
		System.out.println("\n Informe o nome do professor: ");
		nome = leia.next();
		
		System.out.println(" Informe o endereço de " + nome +": ");
		endereco = leia.next();
		
		System.out.println(" Informe a cidade de " + nome + ": ");
		cidade = leia.next();
		
		System.out.println(" Informe o UF de " + nome + ": ");
		uf = leia.next();
		
		System.out.println(" Informe o curso de " + nome + ": ");
		curso = leia.next();
		
		System.out.println(" Informe o cep de " + nome + ": ");
		cep = leia.next();
		
		System.out.println(" Informe o telefone de " + nome + ": ");
		telefone = leia.next();
		
		System.out.println(" Informe o cpf de " + nome + ": ");
		cpf = leia.next();
		
		System.out.println(" Informe o nascimento de " + nome + ": ");
		nasc = leia.next();
		
		System.out.println(" Informe a escolaridade de "  + nome + ": ");
		escolaridade = leia.next();
		
		System.out.println(" Informe o RG de "  + nome + ": ");
		rg = leia.next();
				
		System.out.println("\n\tNome: " + nome);
		System.out.println("\tEndereço: " + endereco);
		System.out.println("\tCidade: " + cidade);
		System.out.println("\tU.F: " + uf);
		System.out.println("\tCurso: " + curso);
		System.out.println("\tC.E.P: " + cep);
		System.out.println("\tTelefone: " + telefone);
		System.out.println("\tCPF: " + cpf);
		System.out.println("\tNascimento: " + nasc);
		System.out.println("\tEscolaridade: " + escolaridade);
		System.out.println("\tE.G: " + rg);
		
		}
	i ++;
	}

}
