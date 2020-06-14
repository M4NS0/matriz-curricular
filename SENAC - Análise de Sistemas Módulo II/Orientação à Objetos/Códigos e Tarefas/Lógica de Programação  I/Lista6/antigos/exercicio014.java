package Lista6;
import java.util.Scanner;

public class exercicio014 {
	public static void main (String args []) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\tCalcular o fatorial de um valor que será digitado."
				+ "\n\tEste valor não poderá ser negativo."
				+ "\n\tEnviar mensagem de erro e solicitar o valor novamente, se necessário."
				+ "\n\tPerguntar se o usuário deseja ou não fazer um novo cálculo,"
				+ "\n\tpedir confirmação da resposta em “S” ou “N”."
				+ "\n\n\t\tN! = N x N-1 x N-2 x N-3 x ....... x (N - (N-1))"
				+ "\n\t\tEx: 5! = 5 x 4 x 3 x 2 x 1 = 120");
		
		int numero, contador, fatorial;
		String sim, nao, escolha;
		fatorial = 1;
		escolha ="s";
		
		
		while (escolha.equals("s")) {
		
			System.out.println("\n\tDigite um numero qualquer para calcular o fatorial: ");
			numero = leia.nextInt();
			escolha = "s";
			
			while (numero<=0) {
			System.out.println("\n\tNumero invalido por ser Negativo.\n\tInsira um numero positivo: ");
			numero = leia.nextInt();
			
			}
			
			while (numero>=2)  {
			fatorial = fatorial*numero;
	        numero--;

        }
        System.out.println(" !fatorial = " + fatorial);
        System.out.println("\n\tDeseja efetuar uma nova operação fatorial?\n\tDigite (s) ou (n): ");
        escolha = leia.next();
    }
		while (escolha.equals("n")) {
		System.out.println("\n\t[ Fim do Programa ]");
		break;


}
}
}
