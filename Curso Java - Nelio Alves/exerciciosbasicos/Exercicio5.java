package exerciciosbasicos;

import java.util.Scanner;

/*
Crie um algoritmo que leia uma idade de uma pessoa e calcule quantos dias essa pessoa já viveu.
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age and find out how many days you've lived: ");
        int age = input.nextInt();
        int daysAlreadyLived = age * 366;
        System.out.println("\nYou already lived: " + daysAlreadyLived);
        input.close();
    }
}
