package Exercicio4;

public class Aluno {
    
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    
    public double notafinal(){
        return nota1 + nota2 + nota3;
    }
    public double situacao(){
        return 60- notafinal();
    }
    public void verificador(){
        if (notafinal() < 60) {
            System.out.println("Reprovado! ");
            System.out.printf("Faltam %.2f  Pontos " ,situacao() );

        }
        else{
            System.out.println("Aprovado! ");
        }
    }

}
