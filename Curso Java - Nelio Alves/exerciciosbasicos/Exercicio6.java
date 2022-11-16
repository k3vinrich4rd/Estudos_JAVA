package exerciciosbasicos;

import java.util.Scanner;

/*
6 - Crie um algoritmo que lê dois números, X e Y, e mostra o resto da divisão entre eles.
 */
public class Exercicio6 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers and find out the remainder of the division between them: ");
        System.out.print("Enter firstNumber: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter secondNumber: ");
        int secondNumber = input.nextInt();

        int restOfDivision = firstNumber % secondNumber;

        System.out.println("\nThe remainder of the division of the given numbers is: " + restOfDivision);
        input.close();

    }
}
