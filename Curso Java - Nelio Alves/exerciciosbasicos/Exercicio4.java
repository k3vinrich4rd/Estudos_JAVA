package exerciciosbasicos;

import java.util.Scanner;

/*
4 - Crie um algoritmo que lê dois números inteiros, X e Y, e mostre o resultado da multiplicação de x por y.
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers and find out the result of multiplying them \n");
        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        int multiple = firstNumber * secondNumber;

        System.out.println("\nThe result of multiplying the given numbers is: " + multiple);

        input.close();
    }
}
