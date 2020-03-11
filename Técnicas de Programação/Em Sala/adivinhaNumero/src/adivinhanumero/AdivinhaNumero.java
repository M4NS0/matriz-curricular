/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinhanumero;

import java.util.Scanner;

/**
 *
 * @author japa
 */
public class AdivinhaNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AdivinharNumero jogo = new AdivinharNumero();
        Scanner sc = new Scanner (System.in);
        int i,n=5;
        
        for (i=1; i <= n ; i++)
        {
            System.out.println("Qual eh o numero sorteado?");
            if (jogo.dica(sc.nextInt())==true)
                break;
        }
        System.out.println("O numero era: " + jogo.getNumero());
    }
    
}
