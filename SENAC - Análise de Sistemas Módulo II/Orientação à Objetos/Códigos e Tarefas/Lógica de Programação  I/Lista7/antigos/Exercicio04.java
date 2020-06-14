package Lista7;

import java.text.DecimalFormat;

public class Exercicio04 {
	public static void main(String args[]) {

		System.out.println(
				"\n\tNa cidade de Tokio existe cerca de 55000 motocicletas. Já a cidade de Aparecida Goiânia tem cerca "
						+ "\n\tde 1500 motocicletas. Crie um algoritmo que calcule em quantos anos a cidade de Aparecida de Goiânia"
						+ "\n\tsuperará em números de motocicletas a cidade de Tokio, sendo que a taxa de aquisição de motocicletas "
						+ "\n\té de 0,5% a.m. para Tokio e 0,89% a.m. para Aparecida de Goiânia. ");

		float taxaTK, taxaAP, contagemMeses, contagemAnos = 0, motoTK, motoAP;

		motoTK = 55000;
		motoAP = 1500;
		taxaTK = 0.5f / 100; // ao mes
		taxaAP = 0.89f / 100; // ao mes
		contagemMeses = 0;
		DecimalFormat saida = new DecimalFormat("0");
		
		// enquanto a quantidade de motos de aparecida é menor 
		// que a quantidade em tokio acontece o calculo
		while (motoAP <= motoTK) {
			motoAP = motoAP + (motoAP * taxaAP);
			motoTK = motoTK + (motoTK * taxaTK);
			contagemMeses++;
			}
		// convertendo anos para meses
		contagemAnos = contagemMeses / 12;
		System.out.println("\n\t> Daqui a " + contagemAnos + " anos Aparecida de Goiânia terá mais motos que Tokio\n\t> Quantidade de motos em Aparecida será igual a: " + saida.format(motoAP));
	}
}