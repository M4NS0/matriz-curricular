package Setup;

import Formas.*;
import Trigonometria.*;

public class Teste {
	public static void main(String[] args) {
		Poligono p1 = new Poligono();
		p1.setLados(5);
		
		Ponto po2 = new Ponto();
		po2.setX(15);
		po2.setY(20);
		
		Quadrado q1 = new Quadrado();
		q1.setLado(35);
		
		Retangulo r1 = new Retangulo();
		r1.setAltura(25);
		r1.setBase(10);
		
		Triangulo t1 = new Triangulo();
		t1.setLadoA(10);
		t1.setLadoB(20);
		t1.setLadoC(30);
		
		
		System.out.println("\n" + r1);
		System.out.println("\n" + q1);
		System.out.println("\n" + po2);
		System.out.println("\n" + p1);
		System.out.println("\n" + t1);
		
		if (t1.getLadoA() == t1.getLadoB() && t1.getLadoA() == t1.getLadoC() ) {
			System.out.println("Esse triangulo é equilátero");
		}
		if (t1.getLadoA() != t1.getLadoB() && t1.getLadoA() != t1.getLadoC() && t1.getLadoB() != t1.getLadoC() ) {
			System.out.println("Esse triangulo é escaleno");
		}
		if (t1.getLadoA() == t1.getLadoB() && t1.getLadoA() != t1.getLadoC() || t1.getLadoA() != t1.getLadoB() && t1.getLadoA() == t1.getLadoC() || t1.getLadoB() != t1.getLadoC() && t1.getLadoB() == t1.getLadoA()) {
			System.out.println("Esse triangulo é escaleno");
		}
		
		
		
	}
}
