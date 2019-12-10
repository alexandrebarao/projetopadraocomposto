
package projetopadraocomposto;


public class Carro {
    
    Composto Carro;

    public Carro() {

        Carro = new Composto();
        Carro.setNome("Veiculo Ligeiro");
Simples c; 
        
        c = new Simples(); 
        c.setNome("Volvo XC 90");
        c.setPreco(33000);
        
        Carro.adicionaElemento(c);
        
        Composto Componentes = new Composto(); 
        Componentes.setNome("Conjunto de componentes");
        
        c = new Simples(); 
        c.setNome("sensores estacionamento");
        c.setPreco(1000);
  
        Componentes.adicionaElemento(c);
 
        
        c = new Simples(); 
        c.setNome("camara traseira");
        c.setPreco(595);
 
        Componentes.adicionaElemento(c);
 
        Componentes.informacao();
        
    }
    
}
