/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec;

/**
 *
 * @author Guilherme
 */
public class Especial extends Corrente{
    private CartaoCredito cartao;
    private float limite;
    
    // construtores
    public Especial(Correntista correntista){
       super(correntista); 
    }
    //getters e setters

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public CartaoCredito getCartao() {
        return cartao;
    }

    public void setCartao(CartaoCredito cartao) {
        this.cartao = cartao;
    }
    // metodos 
    /**
     * na classe especial existe um limite , assim necessita uma verificação adicional 
     * no metodo
     * @param valor
     */
    @Override
    public void retirar(float valor){
        if(valor > limite){
            System.out.println("Valor maior que o limite da conta!!! ");
        }
        else
            super.retirar(valor);          
    }
}
