package Exercicios;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    public double totalDeValorEstoque() {
       return quantidade * preco;
    }

    public void adicionarProduto (int quantidade) {
        this.quantidade += quantidade;  // this serve para especificar que eu estou me referindo ao atributo da classe 
    }
    public void removerProduto (int quantidade) {
        this.quantidade -= quantidade;
    }
    public String toString() {
        return nome 
        + ", $ "
        + String.format("%.2f", preco)
        +", "
        + quantidade
        + " unidades, Total:  $ "
        + String.format("%.2f", totalDeValorEstoque()) ;

    }
}
