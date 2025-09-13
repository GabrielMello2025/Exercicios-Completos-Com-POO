package Exercicio2;

public class Funcionario {
    
    public String nome;
    public double salarioBruto;
    public double taxa;

    public double salarioLiquido() {
        return salarioBruto - taxa;
    }
    public void aumentoSalario(double porcentagem) {
       salarioBruto = ((salarioBruto * porcentagem)/ 100) + salarioLiquido() ; 
    }
    public String toString() {
return nome 
        + ", "
        + "$ "
        + String.format("%.2f" , salarioBruto);
    }




}

