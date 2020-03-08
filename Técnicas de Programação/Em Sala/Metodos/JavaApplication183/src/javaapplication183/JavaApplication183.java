/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication183;

import java.util.Scanner;

/**
 *
 * @author japa
 */
public class JavaApplication183 {

    public static int somar(int qtde)
    {
        int soma=0;
        int i;
        
        for(i=1;i<=qtde;i++)
            soma+=i;
        
        //System.out.println("Soma S = " + soma);
        return soma;
    }
    
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int Resultado , n;
        System.out.println("Quando elementos?");
        n=ler.nextInt();
        Resultado = somar(n);
        System.out.println("Resultado: Soma = " + Resultado);
        
    }
    
}
