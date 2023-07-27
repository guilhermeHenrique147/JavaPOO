/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec;

/**
 *
 * @author Guilherme
 */
public class CartaoCredito {
    private int numCartao;
    private float limite;
    private String diaMelhorCompra;
    
    //getters e setters

    public int getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(int numCartao) {
        this.numCartao = numCartao;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public String getDiaMelhorCompra() {
        return diaMelhorCompra;
    }

    public void setDiaMelhorCompra(String diaMelhorCompra) {
        this.diaMelhorCompra = diaMelhorCompra;
    }
    
}
