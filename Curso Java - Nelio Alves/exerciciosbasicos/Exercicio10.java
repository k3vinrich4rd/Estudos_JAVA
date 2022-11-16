package exerciciosbasicos;

import java.util.Scanner;

/*
10 - Crie um algoritmo que leia o primeiro nome do usuário e escreva uma saudação para ele.
 */
public class Exercicio10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Hello " + name + " welcome ");

        input.close();
    }
}
