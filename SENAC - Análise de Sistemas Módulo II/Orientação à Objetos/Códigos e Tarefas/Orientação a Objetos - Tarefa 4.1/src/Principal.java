import java.util.ArrayList;
import java.util.Scanner;

public class Principal {


	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int op = -1;
		
		Automovel auto;
		ArrayList<Automovel> listaAuto = new ArrayList<Automovel>();
		
		do {
			
			System.out.println(	"\n===========MENU===========" +
								"\n(1) Para Inserir Automóvel" +
								"\n(2) Para Listar Automóveis" + 
								"\n(3) Para Sair"+
								"\n==========================" +
								"\nEscolha: ");
			op = leia.nextInt();
			
			if (op == 1) {
				
				auto = new Automovel();
				System.out.println(	"\n===========CADASTRO===========" + 
									"\nDigite o ID:");
				auto.setId(leia.nextInt());
				System.out.println("\nDigite o Fabricante:");
				auto.setFabricante(leia.next());
				System.out.println("\nDigite o Modelo:");
				auto.setModelo(leia.next());
				System.out.println("\nDigite o Cor:");
				auto.setCor(leia.next());
				System.out.println("\nDigite o Placa:");
				auto.setPlaca(leia.next());
				System.out.println("\nDigite o Chassi:");
				auto.setChassi(leia.next());
				System.out.println("\nDigite o Ano:");
				auto.setAno(leia.nextInt());
				
				listaAuto.add(auto);
			}
			
			else if (op == 2) {
				System.out.println(	"\n=====LISTA DE CARROS=====");
				for (int i = 0; i < listaAuto.size(); i++) {
					System.out.println(listaAuto.get(i));
					
				}
			}
			if (op == 3) { 
				System.out.println(	"\n===========FIM===========");
			}
			
			
			
			
		} while (op!= 3);

		
	}

	private static void inserirAuto() {
		// TODO Auto-generated method stub
		
	}

}
