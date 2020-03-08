/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import java.util.Scanner;


public class FigurasGeometricas {

    public static void resultados(Quadrado q, Triangulo t)
    {
       System.out.println("\nPerimetro do Quadrado : " + q.Perimetro());
       System.out.println("Area do Quadrado      : " + q.Area());
       ///System.out.println("Area do Triangulo       : " + t.Area());
      // System.out.printf("Hipotenusa do Triangulo : %.2f \n" , t.calculaHipotenusa());
      t.getInformacoes();
    }

    public static void main(String[] args) {
        Quadrado qd = new Quadrado();
        Triangulo tri = new Triangulo();
        Triangulo tri2 = new Triangulo(100);
        Triangulo tri3 = new Triangulo (40,60);
        
        tri.setH(100);
        System.out.println("Base1: " + tri.getB());
        System.out.println("Altura1: " + tri.getH());
        System.out.println("Base2: " + tri2.getB());
        System.out.println("Altura2: " + tri2.getH());
        System.out.println("Base3: " + tri3.getB());
        System.out.println("Altura3: " + tri3.getH());
        Scanner ler = new Scanner (System.in);
        System.out.print("Informe o valor do lado do quadrado: ");
        qd.setLado(ler.nextInt());
        
        System.out.print("\nInforme a base do triangulo: ");  
        tri.setB(ler.nextDouble());
        System.out.print("Informe a altura do triangulo: ");  
        tri.setH(ler.nextDouble());
        
        resultados(qd, tri); 
                
                
    }
    
}
