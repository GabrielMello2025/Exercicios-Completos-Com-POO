package Exercicio2;

import java.util.Locale;
import java.util.Scanner;
import Exercicio2.Funcionario;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner ler = new Scanner(System.in);

    Funcionario funcionario = new Funcionario();
    System.out.print("Nome: ");
    funcionario.nome = ler.nextLine();
    System.out.print("Salario Bruto: ");
    funcionario.salarioBruto = ler.nextDouble();
    System.out.print("Taxa: ");
    funcionario.taxa = ler.nextDouble();

    System.out.println();
    System.out.println("Funcionario: " + funcionario);

    System.out.println();
    System.out.print("Qual a porcentagem de aumento salarial?: ");
    int porcentagem = ler.nextInt();
    funcionario.aumentoSalario(porcentagem);

    System.out.println();
    System.out.println("Dados atualizados: " + funcionario);

  ler.close(); 

} 
}
