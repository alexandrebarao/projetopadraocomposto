/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopadraocomposto;

/**
 *
 * @author alexandrebarao
 */
public class EquipamentoFotografico {
    Composto meuEquipamento;
    
    public EquipamentoFotografico() { 
        meuEquipamento = new Composto(); 
        meuEquipamento.setNome("Equipamento completo");
        
        Simples s; 
        
        s = new Simples(); 
        s.setNome("Fujifilm X-Pro2 (Body)");
        s.setPreco(1500);
        
        meuEquipamento.adicionaElemento(s);
        
        Composto kit = new Composto(); 
        kit.setNome("Kit de objetivas");
      
        s = new Simples(); 
        s.setNome("Objetiva Fujinon XF 23mm F2");
        s.setPreco(495);
  
        kit.adicionaElemento(s);
 
        
        s = new Simples(); 
        s.setNome("Objetiva Fujinon XF 23mm (35mm FF)");
        s.setPreco(495);
 
        kit.adicionaElemento(s);
 
        s = new Simples(); 
        s.setNome("Objetiva Fujinon XF 18-55mm OIS");
        s.setPreco(850);
 
        kit.adicionaElemento(s);
 
        s = new Simples(); 
        s.setNome("Objetiva Fujinon XF 55-200mm");
        s.setPreco(750);
 
        kit.adicionaElemento(s);
        
        meuEquipamento.adicionaElemento(kit);
    }
    
    public void informacao() { 
        meuEquipamento.informacao();
    }
}
