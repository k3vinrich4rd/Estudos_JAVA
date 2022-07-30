package exerciciobasico;

import java.util.Scanner;

public class Exercicio3 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Digite um número: ");
        double numero1 = input.nextDouble();
        System.out.print("Digite um segundo número: ");
        double numero2 = input.nextDouble();
        input.close();

        double soma = numero1 + numero2;
        System.out.println("O resultado da soma dos número informados é: " + soma);
    }
}
