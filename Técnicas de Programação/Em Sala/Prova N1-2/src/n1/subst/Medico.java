/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n1.subst;

import java.util.ArrayList;

/**
 *
 * @author anibal.jukemura
 */
public class Medico extends Funcionario {
    private int CRM;
    private ArrayList<Consultas> agenda;

    public Medico(int CRM, String nome, String codigo) {
        super(nome, codigo);
        this.CRM = CRM;
        agenda= new ArrayList<Consultas>();
    }

    protected int getCRM() {
        return CRM;
    }

    protected ArrayList<Consultas> getAgenda() {
        return agenda;
    }

    protected void setAgenda(ArrayList<Consultas> agenda) {
        this.agenda = agenda;
    }
    
    
}
