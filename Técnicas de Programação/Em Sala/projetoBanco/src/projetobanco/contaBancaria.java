/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobanco;

/**
 *
 * @author japa
 */
public class contaBancaria {
    public double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void deposita(double valor)
    {
        saldo = saldo + valor;
    }
    
    public double retira(double valor)
    {
        saldo = saldo - valor;
        return valor;
    }
}
