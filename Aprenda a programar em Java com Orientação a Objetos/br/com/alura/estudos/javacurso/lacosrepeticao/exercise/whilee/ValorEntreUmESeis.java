package br.com.alura.estudos.javacurso.lacosrepeticao.exercise.whilee;/*Digite um valor entre um e seis*/

import java.util.Scanner;

public class ValorEntreUmESeis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int firstValue = 0;
        int secondValue = 0;

        //Com o operador lógico "OU" basta só um valor ser true (verdadeiro)
        while (firstValue == 1 || secondValue <= 6) {

            System.out.println("Enter a number between 1 and 6");
            System.out.print("First number: ");
            firstValue = input.nextInt();
            System.out.print("Second number: ");
            secondValue = input.nextInt();

        }
        input.close();
        System.out.println("\nThe end");

    }
}