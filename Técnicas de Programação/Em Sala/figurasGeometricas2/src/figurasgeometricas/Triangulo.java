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
    private double h,b,hip;

   public Triangulo ()
    {
        h=10;
        b=5;      
    }
    
    public Triangulo (double altura, double base)
    {
        h=altura;
        b=base;
    }
    
    public Triangulo (double altura)
    {
        h=altura;
        b=0;
    }
    
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
    
    private double Area()
    {
        return (b*h/2);
    }
    
    private double calculaHipotenusa()
    {
        hip = Math.sqrt(b*b + Math.pow(h, 2));
        return hip;
    }
    
    public void getInformacoes()
    {
        System.out.println("Area = " + Area());
        System.out.println("Hipotenusa" + calculaHipotenusa());
    }
}
