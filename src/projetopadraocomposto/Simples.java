package projetopadraocomposto;

public class Simples extends Componente {
//======================================================================================================
      public Simples() {
          System.out.println("Está é Simples");
      }
//======================================================================================================
      public void informacao() {
          System.out.println("Marca: " + getNome() + "\nModelo: " + getModelo() + "\nPreço: " + getPreco() + "€");
      }
//======================================================================================================
}
