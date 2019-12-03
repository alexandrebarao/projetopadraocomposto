/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopadraocomposto;

/**
 *
 * @author ricardopissarra
 */
public class Skate {
    
    Composto meuSkate;
    
    public Skate () {
    
    meuSkate = new Composto();
    meuSkate.setNome("Skateboard");
    
    Simples s1;
    Simples s2;
    
    s1  = new Simples();
    s1.setNome("Tabua");
    s1.setPreco(50);

    s2  = new Simples();
    s2.setNome("Grip tape");
    s2.setPreco(10);

    Composto c2;
    
    c2 = new Composto();
    c2.setNome("Wheels");

    Simples s21;
    
    s21 = new Simples();
    s21.setNome("Wheel #1");
    s21.setPreco(5);

    Simples s22;
    
    s22 = new Simples();
    s22.setNome("Wheel #2");
    s22.setPreco(5);

    Simples s23;
    
    s23 = new Simples();
    s23.setNome("Wheel #3");
    s23.setPreco(5);

    Simples s24;
    
    s24 = new Simples();
    s24.setNome("Wheel #4");
    s24.setPreco(5);

    c2.adicionaElemento(s21);
    c2.adicionaElemento(s22);
    c2.adicionaElemento(s23);
    c2.adicionaElemento(s24);

    Composto c3 = new Composto();
    c3.setNome("Trucks");

    Simples s31;
    
    s31 = new Simples();
    s31.setNome("Truck #1");
    s31.setPreco(20);

    Simples s32;
    
    s32 = new Simples();
    s32.setNome("Truck #2");
    s32.setPreco(20);

    c3.adicionaElemento(s31);
    c3.adicionaElemento(s32);

    Composto c4 = new Composto();
    c4.setNome("Bearings");

    Simples s41;
    
    s41 = new Simples();
    s41.setNome("Bearings #1");
    s41.setPreco(2.5);

    Simples s42;
    
    s42 = new Simples();
    s42.setNome("Bearings #2");
    s42.setPreco(42);

    Simples s43;
    
    s43 = new Simples();
    s43.setNome("Bearings #3");
    s43.setPreco(2.5);

    Simples s44;
    
    s44 = new Simples();
    s44.setNome("Bearings #4");
    s44.setPreco(2.5);

    c4.adicionaElemento(s41);
    c4.adicionaElemento(s42);
    c4.adicionaElemento(s43);
    c4.adicionaElemento(s44);

    meuSkate.adicionaElemento(s1);
    meuSkate.adicionaElemento(s2);
    meuSkate.adicionaElemento(c2);
    meuSkate.adicionaElemento(c3);
    meuSkate.adicionaElemento(c4);

    meuSkate.informacao();

    }
}
