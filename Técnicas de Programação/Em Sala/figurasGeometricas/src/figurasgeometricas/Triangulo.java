/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 *
 * @author japa
 */
public class Triangulo {
    public double h,b,hip;

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    public double Area()
    {
        return (b*h/2);
    }
    
    public double calculaHipotenusa()
    {
        hip = Math.sqrt(b*b + Math.pow(h, 2));
        return hip;
    }
}
