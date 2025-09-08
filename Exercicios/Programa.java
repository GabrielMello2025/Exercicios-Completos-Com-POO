package Exercicios;

import java.util.Locale;
import java.util.Scanner;
public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        Produto produto = new Produto();
        System.out.println("\nInsira os dados do produto: ");
        System.out.print("Nome: ");
        produto.nome = ler.nextLine();
        System.out.print("Preço: ");
        produto.preco = ler.nextDouble();
        System.out.print("Quantidade no estoque: ");
        produto.quantidade = ler.nextInt();
        
        System.out.println();
        System.out.println("Dados do produto: "+produto);
        
        System.out.println();
        System.out.print("Insira a quantidade de produtos a serem adicionados em estoque: " );
        int quanti = ler.nextInt();
        produto.adicionarProduto(quanti);
        
        System.out.println();
        System.out.println("Dados atualizados: " +produto);
        System.out.println();

        System.out.print("Digite a quantidade de produtos a serem retirados do estoque: ");
        quanti = ler.nextInt();
        produto.removerProduto(quanti);
        System.out.println();
        System.out.println("Dados atualizados:" +produto);
        System.out.println();
        
        
        
        
        ler.close();
    }

}
