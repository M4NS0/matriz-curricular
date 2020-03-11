/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execlasses;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author anibal.jukemura
 */
public class Pessoa {
    private String nome, dataNascimento;
    private double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private int idade(String dataNascimento)
    {
        int anos=0, dia, mes, ano, mh, dh;
        Date data = new Date();
        GregorianCalendar dataCal = new GregorianCalendar();
        dataCal.setTime(data);
        
        dia=Integer.parseInt(dataNascimento.substring(0,dataNascimento.indexOf("/")));
        dataNascimento=dataNascimento.substring(dataNascimento.indexOf("/")+ 1, dataNascimento.length());
        mes=Integer.parseInt(dataNascimento.substring(0,dataNascimento.indexOf("/")));
        dataNascimento=dataNascimento.substring(dataNascimento.indexOf("/")+ 1, dataNascimento.length());
        ano=Integer.parseInt(dataNascimento);
        anos = 2020-ano-1;
        mh = dataCal.get(Calendar.MONTH)+1;
        dh = dataCal.get(Calendar.DAY_OF_MONTH);
        if (mes<mh)
            anos++;
        else if ((mes==mh) && (dia<=dh))
            anos++;    
        return anos;
    }
    
    public void imprimirDados()
    {
        System.out.println("Nome   : " + nome);
        System.out.println("Altura : " + altura);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Idade  : " + this.idade(dataNascimento) + " anos.");
    }
        
    
}
