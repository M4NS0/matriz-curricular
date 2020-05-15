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
public class Psicologo extends Funcionario {
    private int CRP;
    private ArrayList<Consultas> agenda;
    
    public Psicologo(int CRP, String nome, String codigo) {
        super(nome, codigo);
        this.CRP = CRP;
        agenda= new ArrayList<Consultas>();
    }

    protected int getCRP() {
        return CRP;
    }

    protected ArrayList<Consultas> getAgenda() {
        return agenda;
    }

    protected void setAgenda(ArrayList<Consultas> agenda) {
        this.agenda = agenda;
    }
    
    
    
}
