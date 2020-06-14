package Adm;
import java.util.ArrayList;

import grupo1.*;
import grupo2.CamaroteInferior;
import grupo2.CamaroteSuperior;
import Adm.*;
public class Teste {
	public static void main (String [] args) {
		
		ArrayList<Ingresso> lista = new ArrayList<Ingresso>();
		
		VIP vip1 = new VIP(100);
		vip1.setAdicional(50);
		vip1.setTipo("V.I.P");
		
		Normal n1 = new Normal(85.5f);
		n1.setTipo("Normal");
		
		CamaroteInferior ci1 = new CamaroteInferior(120.5f);
		ci1.setTipo("Camarote Inferior");
		
		CamaroteSuperior cs1 = new CamaroteSuperior(200);
		cs1.setTipo("Camarote Superior");
		cs1.setAdicional(30.5f);
		
		lista.add(vip1);
		lista.add(n1);
		lista.add(ci1);
		lista.add(cs1);
	
		
		
		System.out.println(lista);
		
	}

}
