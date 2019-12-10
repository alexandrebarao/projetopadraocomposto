
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
public class ProjetoPadraoComposto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        Simples s1 = new Simples();
//        s1.setNome("Rato");
//        s1.setPreco(12);
//        
//        Simples s2 = new Simples();
//        s2.setNome("Teclado");
//        s2.setPreco(22);
//        
//        Simples s3 = new Simples();
//        s3.setNome("Monitor");
//        s3.setPreco(80);
//        
////        s1.informacao();
////        s2.informacao();
////        s3.informacao();
//        
//        Composto c1 = new Composto();
//        c1.setNome("PC");
//        c1.adicionaElemento(s1);
//        c1.adicionaElemento(s2);
//        c1.adicionaElemento(s3);
//        
////        c1.informacao();
//        
//        Simples s4 = new Simples();
//        s4.setNome("Mesa");
//        s4.setPreco(100);
//        
//        Composto c2 = new Composto();
//        c2.setNome("Equipamento");
//        c2.adicionaElemento(c1);
//        c2.adicionaElemento(s4);
//        
//        c2.informacao();
        
        Composto c1 = new Composto();
        c1.setNome("Caixa #1 de marcadores");
        
        Simples s1  = new Simples();
        s1.setNome("Marcador 1");
        s1.setPreco(1);
        
        Simples s2  = new Simples();
        s2.setNome("Marcador 2");
        s2.setPreco(1);

        Simples s3  = new Simples();
        s3.setNome("Marcador 3");
        s3.setPreco(1);

        c1.adicionaElemento(s1);
        c1.adicionaElemento(s2);
        c1.adicionaElemento(s3);
        
//        c1.informacao();

        
        Composto c2 = new Composto();
        c2.setNome("Caixa #2 de marcadores");
        
        Simples s21  = new Simples();
        s21.setNome("Marcador A");
        s21.setPreco(1);
        
        Simples s22  = new Simples();
        s22.setNome("Marcador B");
        s22.setPreco(1);

        c2.adicionaElemento(s21);
        c2.adicionaElemento(s22);
               
//        c2.informacao();

        Composto c3 = new Composto();
        c3.setNome("Volume de caixas!");
        
        c3.adicionaElemento(c1);
        c3.adicionaElemento(c2);
        
        c3.informacao();
        
        
        System.out.println("------------------------------");
        
        Simples c5 = new Simples();
        c5.setNome("Marcador Sergio");
        c5.setPreco(50);
        
        Simples c6 = new Simples();
        c6.setNome("Marcador Sergio Special Edition");
        c6.setPreco(150);
        
        
        Composto c4 = new Composto();
        c4.setNome("Caixa Marcadores Sergio");
        
     
        c4.adicionaElemento(c5);
        c4.adicionaElemento(c6);
        
        c4.informacao();
        
      
        Skate s = new Skate();
        s.informacao();
    }
    
}



