/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec;

/**
 *
 * @author Guilherme
 */
public class Conta {
    private int numero;
    private float saldo;
    private Correntista correntista;
    //construtor
    public Conta(Correntista correntista){
        this.correntista = correntista;
    }
    //getters e setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Correntista getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Correntista correntista) {
        this.correntista = correntista;
    }
    //metodos
    /**
     * 
     * @param valor
     */
    public void depositar(float valor){
         this.saldo += valor;
    }
    /**
     * 
     * @param valor
     */
    public void retirar(float valor){
        if(valor > getSaldo()){
            System.out.println("Saldo insuficiente!!!!");
        }
        else    
            this.saldo -= valor;
    }
}
