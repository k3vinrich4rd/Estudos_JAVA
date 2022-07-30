package exerciciobasico;

import java.util.Scanner;

public class Exercicio4 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a sua primeira nota: ");
        double nota1 = input.nextDouble();
        System.out.print("Informe a sua segunda nota: ");
        double nota2 = input.nextDouble();
        System.out.print("Informe a sua terceira nota: ");
        double nota3 = input.nextDouble();
        System.out.print("Informe a sua quarta nota: ");
        double nota4 = input.nextDouble();
        input.close();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("O resultado da soma das médias é: " + media);


    }
}
