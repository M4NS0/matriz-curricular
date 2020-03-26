/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorteio;

/**
 *
 * @author japa
 */
public class Sorteio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
       classeSorteio sorteio = new classeSorteio();
       
        System.out.println("Lancando o dado...");
        sorteio.lancarDado();
        Thread.sleep(2000);
        System.out.println("Numero sorteado: " + sorteio.getValor());
    }
    
}
