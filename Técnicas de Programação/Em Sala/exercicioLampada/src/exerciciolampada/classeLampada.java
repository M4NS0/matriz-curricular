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
public class classeLampada {
    private String status;

    public classeLampada(boolean s)
    {
        if (s)
            status = "Acesa";
        else
            status = "Apagada";
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
