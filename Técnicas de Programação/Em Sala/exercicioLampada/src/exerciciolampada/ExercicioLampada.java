/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciolampada;

/**
 *
 * @author japa
 */
public class ExercicioLampada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        classeLampada lampada1 = new classeLampada(true);
        classeLampada lampada2 = new classeLampada(false);
        
        System.out.println("Lampada 1:" + lampada1.getStatus());
        System.out.println("Lampada 2:" + lampada2.getStatus());
    }
    
}
