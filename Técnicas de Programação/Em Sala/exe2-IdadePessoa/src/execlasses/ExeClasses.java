/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execlasses;

import java.util.Scanner;

/**
 *
 * @author anibal.jukemura
 */
public class ExeClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Pessoa p = new Pessoa();
        System.out.println("Digite o nome da pessoa:");
        p.setNome(sc.next());
        System.out.println("Digite a altura da pessoa:");
        p.setAltura(sc.nextDouble());
        System.out.println("Digite a data de nascimento (dd/mm/aaaa):");
        p.setDataNascimento(sc.next());
        p.imprimirDados();;
    }
    
}
