package projetopadraocomposto;

public class Motos {
    Composto minhasMotos;

    public Motos(){

        minhasMotos = new Composto();
        minhasMotos.setNome("\tBikes Guilherme".toUpperCase());

        Simples sim;
        SimplesDois simp;

        sim = new Simples();
        sim.setNome("Honda");
        sim.setModelo("Hornet 600cc");
        sim.setPreco(4500);
        minhasMotos.adicionaElemento(sim);

        Composto opcionais = new Composto();

        opcionais.setNome("\n\n\tOpcionais Moto\n");

        simp = new SimplesDois();
        simp.setNome("Freio ABS");
        simp.setPreco(299);
        opcionais.adicionaElemento(simp);

        simp = new SimplesDois();
        simp.setNome("GPS");
        simp.setPreco(199);
        opcionais.adicionaElemento(simp);

        simp = new SimplesDois();
        simp.setNome("Ponteira Esportiva");
        simp.setPreco(99);
        opcionais.adicionaElemento(simp);

        simp = new SimplesDois();
        simp.setNome("Sistema Alarme");
        simp.setPreco(299);
        opcionais.adicionaElemento(simp);

        minhasMotos.adicionaElemento(opcionais);
    }
    public void infoMotos(){
        minhasMotos.informacao();
    }
//======================================================================================================
}
