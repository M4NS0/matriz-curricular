/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication186;

import java.util.Random;
import java.util.Scanner;


public class JavaApplication186 {

    public static void jogarDado(int n)
    {
        Random semente = new Random();
        
        int i;
        for (i=1;i<=n;i++)
        {
            System.out.println("Numero sorteado: " + (semente.nextInt(6)+1));   
        }
    }
    

    public static void main(String[] args) {
       Scanner ler = new Scanner (System.in);
       int jogadas=0;
        System.out.println("Quantas vezes quer que jogue o dado?");
        jogadas=ler.nextInt();
        jogarDado(jogadas);
    }
    
}
