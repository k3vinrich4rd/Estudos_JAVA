package exerciciosbasicos;

import java.util.Scanner;

/*
2 - Crie um algoritmo que leia um número inteiro e mostre seu sucessor. (feito)
 */
public class Exercicio2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number and find out your successor: ");
        int number = input.nextInt();
        int sucessor = number + 1;
        System.out.println("\nThe successor of the entered number is the: " + sucessor);

        input.close();
    }
}
