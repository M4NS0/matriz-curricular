// b)   Ler uma determinada hora, seus minutos e segundos e converter tudo para segundos. Mostrar no
//		v�deo quantos segundos correspondem � hora lida (observa��o: 1 hora = 60 minutos e 1 minuto =60 segundos).


package Lista2;

import java.util.Scanner;

public class Exercicio02{
	
		public static void main(String args[]) {
		
			int hora, horaconvertida, minutos, minutoconvertido, segundos;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.print("Digite a Hora: ");
			hora = 	leia.nextInt();
			
			System.out.print("Digite os Minutos: ");
			minutos = 	leia.nextInt();

			System.out.print("Digite os Segundos: ");
			segundos = 	leia.nextInt();

			horaconvertida = (hora) * 60 * 60;
			minutoconvertido = (minutos) * 60;
			
			System.out.println("A Hora digitada foi: " + hora);
			System.out.println("Os Minutos Digitados foi: " + minutos);
			System.out.println("Os Segundos Digitados foi: " + segundos);
			System.out.println("A Hora digitada convertida em Segundos: " + horaconvertida);
			System.out.println("Os Minutos digitados convertidos em Segundos: " + minutoconvertido);
				
			
			
		}
		
}
