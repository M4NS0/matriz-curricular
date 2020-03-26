/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetorescarros;

import java.util.Scanner;

/**
 *
 * @author japa
 */
public class VetoresCarros {

    public static void comparaCarro(Carro F[], Carro W[], Carro K[], int n)
    {
        Carro Melhor = new Carro();
        int i;
        for (i=1;i<n;i++)
        {
            if (F[i].getValor()<W[i].getValor() && F[i].getValor()<K[i].getValor())
                Melhor = F[i];
            else if (W[i].getValor()<F[i].getValor() && W[i].getValor()<K[i].getValor())
                Melhor = W[i];
            else if (K[i].getValor()<F[i].getValor() && K[i].getValor()<W[i].getValor())
                Melhor = K[i];
            System.out.println("\nMelhor carro " + i + ":");
            System.out.println("Marca : " + Melhor.getMarca()); 
            System.out.println("Modelo: " + Melhor.getModelo()); 
            System.out.println("Valor : " + Melhor.getValor()); 
        }
        
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=5;
        Carro FIAT[] = new Carro[n];
        Carro WOLKS[] = new Carro[n];
        Carro KIA[] = new Carro[n];
        
        System.out.println("Carros Fiat:");
        for (int i=1;i<n;i++)
        {
            Carro objCarro = new Carro();
            objCarro.setMarca("FIAT");
            System.out.print("Digite o Modelo: ");
            objCarro.setModelo(sc.next());
            System.out.print("Digite o valor: ");
            objCarro.setValor(sc.nextDouble());            
            FIAT[i]=objCarro;
        }
        System.out.println("Carros WOLKS:");
        for (int i=1;i<n;i++)
        {
            Carro objCarro = new Carro();
            objCarro.setMarca("WOLKS");
            System.out.print("Digite a Modelo: ");
            objCarro.setModelo(sc.next());
            System.out.print("Digite o Valor: ");
            objCarro.setValor(sc.nextDouble());            
            WOLKS[i]=objCarro;
        }   
        System.out.println("Carros KIA:");
        for (int i=1;i<n;i++)
        {
            Carro objCarro = new Carro();
            objCarro.setMarca("KIA");
            System.out.print("Digite a Modelo: ");
            objCarro.setModelo(sc.next());
            System.out.print("Digite o Valor: ");
            objCarro.setValor(sc.nextDouble());            
            KIA[i]=objCarro;
        }  
        System.out.println("");
        comparaCarro(FIAT, WOLKS, KIA, n );
    }
    
}
