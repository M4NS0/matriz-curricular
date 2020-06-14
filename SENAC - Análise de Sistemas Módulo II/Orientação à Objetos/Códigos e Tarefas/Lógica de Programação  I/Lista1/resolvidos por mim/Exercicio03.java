package Lista1;
// 3.   Entrar via teclado com a base e a altura de um retângulo, 
//	calcular e exibir sua área.

import java.util.Scanner;

public class Exercicio03 {

		public static void main(String args[]) {

    int base, altura, area;
    Scanner leia = new Scanner(System.in);

    System.out.println("Digite a base: ");
    base = leia.nextInt();

    System.out.println("Digite a altura: ");
    altura = leia.nextInt();

    area = base * altura;

    System.out.println("A area do retangulo é: " + area);

  }

}