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
        c1.setNome("Skateboard");
        
        Simples s1  = new Simples();
        s1.setNome("Tabua");
        s1.setPreco(50);
        
        Simples s2  = new Simples();
        s2.setNome("Grip tape");
        s2.setPreco(10);
        
        Composto c2 = new Composto();
        c2.setNome("Wheels");
        
        Simples s21 = new Simples();
        s21.setNome("Wheel #1");
        s21.setPreco(5);
        
        Simples s22 = new Simples();
        s22.setNome("Wheel #2");
        s22.setPreco(5);
        
        Simples s23 = new Simples();
        s23.setNome("Wheel #3");
        s23.setPreco(5);
        
        Simples s24 = new Simples();
        s24.setNome("Wheel #4");
        s24.setPreco(5);
        
        c2.adicionaElemento(s21);
        c2.adicionaElemento(s22);
        c2.adicionaElemento(s23);
        c2.adicionaElemento(s24);
        
        Composto c3 = new Composto();
        c3.setNome("Trucks");
        
        Simples s31 = new Simples();
        s31.setNome("Truck #1");
        s31.setPreco(20);
        
        Simples s32 = new Simples();
        s32.setNome("Truck #2");
        s32.setPreco(20);
        
        c3.adicionaElemento(s31);
        c3.adicionaElemento(s32);
        
        Composto c4 = new Composto();
        c4.setNome("Bearings");
        
        Simples s41 = new Simples();
        s41.setNome("Bearings #1");
        s41.setPreco(2.5);
        
        Simples s42 = new Simples();
        s42.setNome("Bearings #2");
        s42.setPreco(42);
        
        Simples s43 = new Simples();
        s43.setNome("Bearings #3");
        s43.setPreco(2.5);
        
        Simples s44 = new Simples();
        s44.setNome("Bearings #4");
        s44.setPreco(2.5);
        
        c4.adicionaElemento(s41);
        c4.adicionaElemento(s42);
        c4.adicionaElemento(s43);
        c4.adicionaElemento(s44);
        
        c1.adicionaElemento(s1);
        c1.adicionaElemento(s2);
        c1.adicionaElemento(c2);
        c1.adicionaElemento(c3);
        c1.adicionaElemento(c4);
        
        c1.informacao();

        
    }
    
}
