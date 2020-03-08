/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobanco;

import java.util.Scanner;

/**
 *
 * @author japa
 */
public class ProjetoBanco {

   
    public static void main(String[] args) {
       Scanner ler = new Scanner (System.in);
       double valor;
       
       contaBancaria itau = new contaBancaria();
       contaBancaria caixa = new contaBancaria();
       
       itau.setSaldo(1000.00);
       caixa.setSaldo(500.00);
        System.out.println("Quanto quer transferir?");
        valor=ler.nextDouble();
        valor = itau.retira(valor);
        caixa.deposita(valor);
        System.out.println("Saldo no itau : U$" + itau.getSaldo());
        System.out.println("Saldo na caixa: U$"+ caixa.getSaldo());
    }
    
}
