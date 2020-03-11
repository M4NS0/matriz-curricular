/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinhanumero;

import java.util.Random;

/**
 *
 * @author japa
 */
public class AdivinharNumero {
    private int numero;
     
    public AdivinharNumero()
    {
        sorteiaNumero();
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    private void sorteiaNumero()
    {   
        Random gerador = new Random();
        numero = gerador.nextInt(100)+1;
    }
    
    public boolean dica (int tentativa){
        if (tentativa==numero)
        {    System.out.println("Acertou!");
             return true;
        }
        else if (tentativa>numero)
                 System.out.println("O numero eh menor.");
             else 
                 System.out.println("O numero eh maior.");
        return false;     
    }
}
