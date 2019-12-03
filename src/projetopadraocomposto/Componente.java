/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopadraocomposto;

/**
 *
 * @author Administrator
 */
public abstract class Componente {
    
    private String nome;
    private String modelo;
    private double preco;
    
    public Componente() {
        
    }

    public void informacao() {
        
    }
    
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the preco
     */
    //=============================================================APENAS UM TESTE=============================
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    //=============================================================APENAS UM TESTE=============================
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    
}
