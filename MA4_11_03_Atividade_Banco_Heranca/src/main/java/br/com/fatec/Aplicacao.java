/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec;

/**
 *
 * @author Guilherme
 */
public class Aplicacao extends Rendimento{
    private float iof;
    // construtores
    public Aplicacao(Correntista correntista){
       super(correntista); 
    }
    //getters e setters

    public float getIof() {
        return iof;
    }

    public void setIof(float iof) {
        this.iof = iof;
    }
    //metodos
    /**
     * Desconta IOF
     */
    public void descontaIOF(){
        setSaldo(getSaldo() - iof);
    }
}
