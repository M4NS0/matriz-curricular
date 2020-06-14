package Lista4;
import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	System.out.print("\n\t\tA partir dos valores da aceleração (a em m/s2), da velocidade inicial (v0 em m/s)" + 
			 "\n\t\te do tempo de percurso (t em s). Calcular e exibir a velocidade final de automóvel em km/h.");

	double metroporsegundoconvertido,segundoconvertido, aceleracao,aceleracaoconvertida,velocidadefinal,velocidadeinicial,tempo;
	
	System.out.print("\n\n\t\tDigite a aceleração do veiculo (em metros por segundo): ");
	aceleracao = leia.nextDouble();
			
	System.out.print("\n\t\tDigite a velocidade inicial do veiculo (em km por hora): ");
	velocidadeinicial = leia.nextDouble();
	
	System.out.print("\n\t\tDigite o tempo do percurso do veiculo (em segundos): ");
	tempo = leia.nextDouble();
	
	//V = v0 + a. t
	segundoconvertido = tempo * 60;
	aceleracaoconvertida = aceleracao / (3.6);
		
	velocidadefinal = (velocidadeinicial+ aceleracaoconvertida*segundoconvertido);
	
	if (velocidadefinal <= 40) {
		System.out.print("\n\t\tVeiculo muito LENTO.");
	} else if ((velocidadefinal > 40) && (velocidadefinal <= 60)) {
		System.out.print("\n\t\tVeiculo em velocidade PERMITIDA.");
	} else if ((velocidadefinal > 60) && (velocidadefinal <= 80)) {
		System.out.print("\n\t\tVeiculo em velocidade CRUZEIRO.");
	} else if ((velocidadefinal > 80) && (velocidadefinal <= 120)) {
		System.out.print("\n\t\tVeiculo RAPIDO.");
	} else if (velocidadefinal > 120) { 
		System.out.print("\n\t\tVeiculo MUITO RAPIDO.");
				
				}
		}
}
