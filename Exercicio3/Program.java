package Exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();
        System.out.println("Insira a largura e a altura do retângulo: ");
        retangulo.largura = ler.nextDouble();
        retangulo.altura = ler.nextDouble();

        System.out.println();
        System.out.printf("AREA = %.2f " , retangulo.area());

        System.out.println();
        System.out.printf("PERIMETRO = %.2f" , retangulo.perimetro());

        System.out.println();
        System.out.printf("DIAGONAL = %.2f" , retangulo.diagonal());
        System.out.println();

        ler.close();

    }
}
