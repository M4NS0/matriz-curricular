/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maximo;

import java.util.Scanner;

/**
 *
 * @author japa
 */
public class Maximo {
     
    public static void maximo(double x, double y, double z)
    {
        double max;
        max=x;
        if (y>x)
        {
            max=y;
            if (z>max)
                max=z;
        }
        else if (x<z)
            max=z;
        System.out.println("Maximo entre x,y,z eh: " + max);
    }
 
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double x,y,z;
        System.out.println("Digite o primeiro num:");
        x = teclado.nextDouble();
        System.out.println("Digite o segundo num:");
        y = teclado.nextDouble();
        System.out.println("Digite o terceiro num:");
        z = teclado.nextDouble();
        maximo(x,y,z);
    }
    
}
