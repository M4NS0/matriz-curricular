public class Exercicio04 {

	public static void main(String[] args) {
		
		float qtdeMotoAp = 1500f, qtdeMotoTokio = 55000f;
		int meses = 0, anos = 0;
		
		while (qtdeMotoAp < qtdeMotoTokio) {
			qtdeMotoAp    = qtdeMotoAp    + (qtdeMotoAp    * 0.89f/100);
			qtdeMotoTokio = qtdeMotoTokio + (qtdeMotoTokio * 0.50f/100);
			meses++;
		}
		anos = meses / 12;
		System.out.println("Aparecida de Goiania alcaçará Tókio em " + anos + "ano(s).");
		System.out.println("Quantidade de motos Aparecida de Goiania = " + qtdeMotoAp);
		System.out.println("Quantidade de motos Tókio                = " + qtdeMotoTokio);
		System.out.println("Motos a mais                             = " + (qtdeMotoAp - qtdeMotoTokio));
	}

}
