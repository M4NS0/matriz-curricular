/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;


public class Quadrado {
    public int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    public int Area()
    {
        return lado*lado;
    }
    
    public int Perimetro()
    {
        return (lado+lado+lado+lado);
    }
}
