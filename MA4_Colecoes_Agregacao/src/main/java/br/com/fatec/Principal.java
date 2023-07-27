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
        Proprietario p = new Proprietario("Fulano", "123.456.789-00");
        p.addVeiculo(new Veiculo("ABC-1234", 50000));
        p.addVeiculo(new Veiculo("DEF-5678", 60000));
        p.addVeiculo(new Veiculo("GHI-9101", 70000));
        p.addVeiculo(new Veiculo("JKL-2345", 80000));
        p.addVeiculo(new Veiculo("MNO-6789", 90000));
        p.addVeiculo(new Veiculo("PQR-1112", 100000));
        
        for (Veiculo veiculo : p.getVeiculo()) {
            System.out.println("Placa: " + veiculo.getPlaca() + ", valor: " + veiculo.getValor());
        }
        
        float valorTotal = p.valorBens();
        System.out.println("Valor total dos bens: " + valorTotal);
    }
}
