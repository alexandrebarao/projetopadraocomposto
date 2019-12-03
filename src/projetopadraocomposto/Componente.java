package projetopadraocomposto;

public abstract class Componente {
    
    private String nome;
    private String modelo;
    private double preco;
//======================================================================================================
    public Componente() {
        
    }
//======================================================================================================
    public void informacao() {
        
    }
//======================================================================================================
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
//=============================================================APENAS UM TESTE=============================
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
//=============================================================APENAS UM TESTE=============================
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
//======================================================================================================
}
