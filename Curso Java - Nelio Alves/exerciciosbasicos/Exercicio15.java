package exerciciosbasicos;

import java.util.Scanner;

/*
15 - Crie um algoritmo que leia dois valores (x e y) e informe qual o maior valor.
 */
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers and know which is the sea");
        System.out.print("Enter first number: ");
        double x = input.nextDouble();
        System.out.print("Enter second number: ");
        double y = input.nextDouble();

        if (x > y) {
            System.out.println("X is is greater than Y");
        } else {
            System.out.println("Y is is greater than X");
        }
        input.close();
    }
}
