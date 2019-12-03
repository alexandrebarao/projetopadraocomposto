/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopadraocomposto;

/**
 *
 * @author sergi
 */
public class InstrumentoDeCorda {

    Composto instrumentoDeCorda;

    public InstrumentoDeCorda() {

        instrumentoDeCorda = new Composto();
        instrumentoDeCorda.setNome("Guitarra Electrica");

        Simples s;

        s = new Simples();
        s.setNome("Fender Player Stratocaster");
        s.setPreco(649);

        instrumentoDeCorda.adicionaElemento(s);

        Composto kit = new Composto();
        kit.setNome("Acessórios");

        s = new Simples();
        s.setNome("Cordas Guitarra Fender");
        s.setPreco(6.90);

        kit.adicionaElemento(s);

        s = new Simples();
        s.setNome("Alicate de cordas Fender");
        s.setPreco(16);

        kit.adicionaElemento(s);

        s = new Simples();
        s.setNome("Afinador Korg Pitchhawk G2");
        s.setPreco(59);

        kit.adicionaElemento(s);

        s = new Simples();
        s.setNome("Suporte para Guitarra Fender");
        s.setPreco(56);

        kit.adicionaElemento(s);

        instrumentoDeCorda.adicionaElemento(kit);
    }

    public void informacao() {
        instrumentoDeCorda.informacao();
    }

}