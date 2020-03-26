/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorteio;

import java.util.Random;

/**
 *
 * @author japa
 */
public class classeSorteio {
   private classeDado valor;
   
   public classeSorteio()
   {
       valor = new classeDado();
   }
   
   public int getValor()
   {
       return valor.getValorSelecionado();
   }
   
   public void lancarDado()
   {
       Random semente = new Random();
       valor.setValorSelecionado(semente.nextInt(6)+1);
   }
}
