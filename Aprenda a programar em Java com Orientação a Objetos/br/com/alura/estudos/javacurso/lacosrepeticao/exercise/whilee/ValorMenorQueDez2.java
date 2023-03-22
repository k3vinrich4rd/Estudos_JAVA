package br.com.alura.estudos.javacurso.lacosrepeticao.exercise.whilee;/*Digite um valor menor que 10*/

import java.util.Scanner;

public class ValorMenorQueDez2 {
    public static void main(String[] args) {
        int firstValue = 0;
        int secondValue = 0;

        //Com o operador lógico "OU" basta só um valor ser true (verdadeiro)
        while (firstValue < 10 || secondValue < 10) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter value greater than 10");
            System.out.print("First value: ");
            firstValue = input.nextInt();
            System.out.print("Second value: ");
            secondValue = input.nextInt();
        }
        System.out.println("The end");
    }
}