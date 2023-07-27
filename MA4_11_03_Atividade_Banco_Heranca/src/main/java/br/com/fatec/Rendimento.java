/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec;

/**
 *
 * @author Guilherme
 */
public class Rendimento extends Conta{
    private float juros;
    
    // construtores
    public Rendimento(Correntista correntista){
       super(correntista); 
    }
    //getters e setters

    public float getJuros() {
        return juros;
    }

    public void setJuros(float juros) {
        this.juros = juros;
    }
    //metodos
    /**
     * metodo que calcula os rendimentos da conta do tipo rendimento com base nos juros
     */
    public void geraRendimento(){
        setSaldo(getSaldo()* juros);
    }
}
