package Exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        Aluno aluno = new Aluno();
        System.out.println("Digite suas tres notas obtidas no trimestre: ");
        aluno.nota1 = ler.nextDouble();
        aluno.nota2 = ler.nextDouble();
        aluno.nota3 = ler.nextDouble();
        
        System.out.println();

        System.out.printf("Nota Final = %.2f " , aluno.notafinal());
        System.out.println();
        aluno.verificador(); // imprimi no terminal o resultado da verificação do if else.
        
        ler.close();
    }
}
