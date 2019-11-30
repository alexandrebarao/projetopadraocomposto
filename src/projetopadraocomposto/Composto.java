/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopadraocomposto;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Composto extends Componente{
    
    ArrayList lista; 
    
    public Composto () {
        lista = new ArrayList();
    }
    
    public void adicionaElemento(Componente c) {
        lista.add(c);
    }
    
    /*
    public double getPreco() {
        
        double p = 0;
        
        for (int i = 0; i < lista.size();i++ ) {
             Componente c = (Componente) lista.get(i);
             p = p + c.getPreco();
         }
        
        return p;
    }
    */
    
    public void informacao() {
         System.out.println("COMPOSTO: " + getNome() );
         for (int i = 0; i < lista.size();i++ ) {
             Componente c = (Componente) lista.get(i);
             c.informacao();
         }
    }
    
    
    
}
