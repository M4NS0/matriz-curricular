package Adm;
import java.util.ArrayList;

import Adm.*;
import imoveis.*;
public class Teste {
	public static void main(String[] args) {
		ArrayList<Imovel> lista = new ArrayList<Imovel>();
		Novo n1 = new Novo(200000.5f);
		n1.setTipo("Novo");
		n1.setAdicional(20);
		
		Antigo a1 = new Antigo(180000.3f);
		a1.setTipo("Antigo");
		a1.setDesconto(25.5f);
		
		lista.add(n1);
		lista.add(a1);
		
		System.out.println(lista);
	}
}
