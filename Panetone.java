/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author whaty
 */
abstract class Panetone {
    private String nome;
    private double valor;
    private String peso;

    public Panetone(String nome, String peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public Panetone() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

 
    
    
    
}
