/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n1.subst;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author anibal.jukemura
 */
public class N1Subst {

    public static void menu()
    {
        System.out.println("#########################");
        System.out.println("#  1-Cadastrar Doutor   #");        
        System.out.println("#  2-Agendar            #");
        System.out.println("#  3-Consulta Agenda    #");
        System.out.println("#  9-Sair               #");
        System.out.println("#########################");
        System.out.print("Opcao: "); 
    }
    public static Funcionario Cadastrar(String opcao)
    {
        Scanner sc = new Scanner (System.in);
        String nome,codigo;
        int CRM,CRP;
        System.out.println("Digite o nome:");
        nome=sc.next();
        System.out.println("Digite o codigo:");
        codigo=sc.next();        
        if (opcao.equals("M"))
        {
            System.out.println("Digite o CRM:");
            CRM=sc.nextInt();
            Funcionario medico = new Medico(CRM, nome, codigo);
            return medico;
        }
        else if (opcao.equals("P"))
        {
            System.out.println("Digite o CRP:");
            CRP=sc.nextInt();
            Funcionario psicologo = new Psicologo(CRP, nome, codigo);
            return psicologo;
        }
        return null;
    }
    

    public static void Consultar(Funcionario medico, Funcionario psicologo)
    {
        Medico med = (Medico)medico;
        Psicologo psic = (Psicologo) psicologo;
        System.out.println("Medico:" + medico.getNome());
        System.out.println("Código:" + medico.getCodigo());
        System.out.println("CRM   : " + med.getCRM());
        System.out.println("AGENDA:");
        for(Consultas c: med.getAgenda())
        {
            System.out.println("Paciente: " + c.getPaciente());
            System.out.println("Hora    : " + c.getHora()+ "H");
        }
        System.out.println("\nPscicologo:" + psicologo.getNome());
        System.out.println("Código    :" + psicologo.getCodigo());
        System.out.println("CRP       : " + psic.getCRP());
        System.out.println("AGENDA:");
        for(Consultas c: psic.getAgenda())
        {
            System.out.println("\tPaciente: " + c.getPaciente());
            System.out.println("\tHora    : " + c.getHora() + "H");
        }        
        
    }    
    
    public static void main(String[] args) {
        Funcionario medico=null, psicologo=null;
        String nome="", hora;
        ArrayList<Consultas> agendaMedico = new ArrayList<Consultas>();
        ArrayList<Consultas> agendaPsicologo = new ArrayList<Consultas>();
        Scanner sc = new Scanner (System.in);
        int opcao=0;
        String op="";
        while (opcao!=9)
        {
           menu();
           opcao=sc.nextInt();
           switch(opcao)
           {
               case 1: 
                    System.out.println("(P)sicologo ou (M)edico, (S)air?(P/M/S)");
                    op=sc.next().toUpperCase();
                    if (op.equals("M")) medico=Cadastrar(op);
                    else if (op.equals("P")) psicologo=Cadastrar(op);
                    else System.out.println("Opcao Invalida!");
                   break;               
               case 2: 
                   while(!op.equals("S"))
                   {
                        System.out.println("(P)sicologo ou (M)edico, (S)air?(P/M/S)");
                        op=sc.next().toUpperCase();
                        if (op.equals("M")) 
                        {
                           System.out.println("Nome do paciente:");
                            nome=sc.next();
                            System.out.println("Horario:");
                            hora=sc.next();
                            Consultas agenda = new Consultas(nome,hora);
                            agendaMedico.add(agenda);
                            Medico med = (Medico)medico;
                            med.setAgenda(agendaMedico);
                        }
                        else if (op.equals("P")) 
                        {
                            System.out.println("Nome do paciente:");
                            nome=sc.next();
                            System.out.println("Horario:");
                            hora=sc.next();
                            Consultas agenda = new Consultas(nome,hora);
                            agendaPsicologo.add(agenda);
                            Psicologo psic = (Psicologo)psicologo;
                            psic.setAgenda(agendaPsicologo);
                        }
                        else 
                            System.out.println("Opcao Invalida!");
                    }
                   break;
               case 3: Consultar(medico, psicologo);
                   break;
           }

        }
    }
    
}
