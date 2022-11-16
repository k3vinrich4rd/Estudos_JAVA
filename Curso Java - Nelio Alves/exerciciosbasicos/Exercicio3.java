package exerciciosbasicos;

import java.util.Scanner;

/*
3 - Crie um algoritmo que leia um número inteiro e mostre seu antecessor.
 */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number and find out your predecessor: ");
        int number = input.nextInt();

        int predecessor = number - 1;
        System.out.println("\nThe predecessor of the entered number is the: " + predecessor);

        input.close();
    }
}
