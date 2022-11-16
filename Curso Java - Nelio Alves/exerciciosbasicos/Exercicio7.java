package exerciciosbasicos;
/*
7 - Crie um algoritmo que lê o salário de um funcionário, reajusta o salário em 7% e mostra o resultado.
 */

import java.util.Scanner;


public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        double salary = input.nextDouble();

        double addition = salary * 0.07;
        double adjustment = addition + salary;

        System.out.printf("Your salary after the seven percent increase is: %.2f", adjustment);

        input.close();


    }
}
