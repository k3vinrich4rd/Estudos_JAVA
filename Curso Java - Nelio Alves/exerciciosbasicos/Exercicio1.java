package exerciciosbasicos;

import java.util.Scanner;

/*
1 - Crie um algoritmo que escreve o seu nome completo, colocando uma palavra em cada linha.
 */
public class Exercicio1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe seu nome completo\n");
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();

        System.out.println("\n" + firstName + " " + lastName);

        input.close();

    }

}
