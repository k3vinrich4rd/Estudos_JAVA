package br.com.alura.estudos.javacurso.lacosrepeticao.exercise.whilee;/*Digite um valor menor que 10*/

import java.util.Scanner;

public class ValorMenorQueDezDoWhile {
    public static void main(String[] args) {

        int firstValue;
        int secondValue;

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter value greater than 10");
            System.out.print("First value: ");
            firstValue = input.nextInt();
            System.out.print("Second value: ");
            secondValue = input.nextInt();
        }

        //Com o operador lógico "E" ambos valores tem que ser true (verdadeiro)
        while (firstValue < 10 && secondValue < 10);
        System.out.println("The end");
    }
}