/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec;

import java.util.Objects;

/**
 *
 * @author Guilherme
 */
public class Veiculo {
    private String placa;
    private float valor;
    
    //contrutor
    public Veiculo(String placa, float valor) {
        this.placa = placa;
        this.valor = valor;
    }
    
    //reescrevendo metotodos equais e hashcode
    
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Veiculo))
            return false;
        Veiculo v = (Veiculo) o;
        return this.placa.equals(v.placa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placa);
    } 
    
    //getters e setters
    
    public String getPlaca() {
        return placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public float getValor() {
        return valor;
    }
    
    public void setValor(float valor) {
        this.valor = valor;
    }   
}
