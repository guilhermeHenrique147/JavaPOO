/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec;

/**
 *
 * @author Guilherme
 */
public class Principal {
    public static void main(String[] args) {
        //instanciando objeto correntista
        Correntista corr = new Correntista("Guilherme", "789.855.465-65");
        //instanciando conta corrente normal
        Normal cor = new Normal(corr);
        cor.setNumero(1);
        cor.setSaldo(1500);
        cor.retirar(500);
        cor.depositar(250);
        System.out.println("Saldo conta corrente normal...: " + cor.getSaldo());
        //instanciando conta corrente especial
        Especial esp = new Especial(corr);
        esp.setNumero(2);
        esp.setSaldo(100);
        esp.setLimite(500);
        esp.depositar(1000);
        System.out.println("Saldo apos deposito...: " + esp.getSaldo());
        esp.retirar(550);
        System.out.println("Saldo apos retirada...: " + esp.getSaldo());
        //instanciando cartao de credito
        CartaoCredito cartao = new CartaoCredito();
        cartao.setNumCartao(4653);
        cartao.setLimite(1000);
        esp.setCartao(cartao);
        cartao.setDiaMelhorCompra("16");
        System.out.println("Limite do cartao...: " + esp.getCartao().getLimite() );
        System.out.println("Melhor dia de compra do cartão...: " + esp.getCartao().getDiaMelhorCompra());
        //instanciando conta rendimento tipo poupança
        Poupanca pop = new Poupanca(corr);
        pop.setJuros(1.05f);
        pop.setNumero(3);
        pop.setSaldo(1500);
        pop.geraRendimento();
        System.out.println("Saldo conta poupanca apos primeiro mes...: " + pop.getSaldo());
        pop.retirar(500);
        pop.depositar(1000);
        pop.geraRendimento();
        System.out.println("Saldo cota poupanca apos segundo mes...: " + pop.getSaldo());
    }
}
