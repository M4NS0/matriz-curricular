/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetorescarros;

/**
 *
 * @author japa
 */
public class Carro {
    private String marca;
    private String modelo;
    private double valor;

    public Carro() {
        this.marca = "Nenhuma";
        this.modelo = "Nao Especificado";
        this.valor = 0.0;
    }

    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
