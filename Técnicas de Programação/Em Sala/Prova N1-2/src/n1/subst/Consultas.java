/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n1.subst;

/**
 *
 * @author anibal.jukemura
 */
public class Consultas {
    private String hora;
    private String paciente;

    public Consultas(String hora, String paciente) {
        this.hora = hora;
        this.paciente = paciente;
    }

    protected String getHora() {
        return hora;
    }

    protected String getPaciente() {
        return paciente;
    }
    
    
    
    
}
