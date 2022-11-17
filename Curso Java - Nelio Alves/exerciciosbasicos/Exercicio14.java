package exerciciosbasicos;

import java.util.Scanner;

/*
14 - Crie um algoritmo que leia dois valores (x e y) e informe se eles são iguais.
 */
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers and find out if they are the same");
        System.out.print("Enter first value: ");
        int x = input.nextInt();
        System.out.print("Enter second value: ");
        int y = input.nextInt();

        if (x == y) {
            System.out.println("The numbers are the same");
        } else {
            System.out.println("The numbers are is not the same");
        }
        input.close();
    }
}
