/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class Proprietario {
    private String nome;
    private String cpf;
    
    //instanciando colecao de agregacao de veiculos
    private Set<Veiculo> veiculo = new HashSet<>();
    
    //construtor
    public Proprietario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.veiculo = new HashSet<>();
    }
    
    //metodos
    /**
     * Adiciona veiculo e verifica se o proprietario já possui 5 veiculos
     * e oferece a opção de adcionar ou não mais apartir do 5 veiculo
     * @param v 
     */
    public void addVeiculo(Veiculo v) {
        if (veiculo.size() >= 5) {
            int resposta = JOptionPane.showConfirmDialog(null, "O proprietário já possui 5 veículos cadastrados. Deseja adicionar mais um?");
            if (resposta != JOptionPane.YES_OPTION) {
                return;
            }
        }
        veiculo.add(v);
    }
    
    /**
     * Calcula a somatoria do valor dos veiculos apartir do uso do iterator
     * @return 
     */
     public float valorBens() {
        float soma = 0;
        Iterator<Veiculo> iterator = veiculo.iterator();
        while (iterator.hasNext()) {
            Veiculo veiculo = iterator.next();
            soma += veiculo.getValor();
        }
        return soma;
    }
    
    /**
     * Retira o veiculo selecionado
     * @param placa
     * @return 
     */
    public Veiculo removeVeiculo(String placa) {
        Veiculo v = new Veiculo("00",00);
        v.setPlaca(placa);
        //antes de remover vamos ver se existe
        if(veiculo.contains(v) == false)
            return null;
        //procura o veiculo
        for (Veiculo aux : veiculo){
            if(aux.getPlaca() == placa){
                v = aux;
                break;
            }
        }
        veiculo.remove(v);
        return v;
    }
   
    //getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Set<Veiculo> getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Set<Veiculo> veiculo) {
        this.veiculo = veiculo;
    }
    
}
