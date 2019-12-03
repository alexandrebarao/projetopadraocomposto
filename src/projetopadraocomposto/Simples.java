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
public class Simples extends Componente {
    
      public Simples() {
          
      }
    
      public void informacao() {
          System.out.println("Marca: " + getNome() + "\nModelo: " + getModelo() + "\nPreço: " + getPreco());
      }
    
    
}
