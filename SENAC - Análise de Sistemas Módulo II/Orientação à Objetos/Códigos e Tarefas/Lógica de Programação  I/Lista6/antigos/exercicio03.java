package Lista6;
import java.util.Scanner;
public class exercicio03 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		System.out.print("\n\tEntrar via teclado com o sexo de determinado usuário,"
			+ "\n\taceitar somente “F” ou “M” como respostas válidas.");

		String sexo;


		System.out.print("\n\nInsira \"f\" se for Mulher ou \"h\" se for Homem ou \"fim\" para interromper esse programa: ");
		sexo = leia.nextLine();

		while (!sexo.equals("fim")) {

			if (sexo.equalsIgnoreCase("f")) {
				System.out.print("> Mulher\n");
			} if (sexo.equalsIgnoreCase("h")) {
				System.out.print("> Homem\n");
			} if (!sexo.equalsIgnoreCase("h") & (!sexo.equals("f"))) {
				System.out.print("> Sexo nao cadastrado\n");

			}
			System.out.print("\nInsira \"f\" se for Mulher ou \"h\" se for Homem ou \"fim\" para interromper esse programa: ");
			sexo = leia.nextLine();
			if (sexo.equalsIgnoreCase("fim")) {
				System.out.print("> Fim do Programa");
			}


		}

	}

}