package exerciciosbasicos;

import java.util.Scanner;

/*
13 - Crie um algoritmo que leia um número do usuário e informe se e o número é positivo ou negativo. (feito)
 */
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number and let me know if it's positive or negative");
        System.out.print("Enter number: ");
        int number = input.nextInt();

        if (number < 0){
            System.out.println("The number is negative");
        }else {
            System.out.println("The number is positive");
        }
        input.close();
    }
}
