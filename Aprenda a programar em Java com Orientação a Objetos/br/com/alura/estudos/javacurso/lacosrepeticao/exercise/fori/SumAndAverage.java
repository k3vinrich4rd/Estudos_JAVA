package br.com.alura.estudos.javacurso.lacosrepeticao.exercise.fori;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de números que gostaria de somar: ");
        int n = input.nextInt();
        System.out.println();

        int sum = 0;
        int average = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int number = input.nextInt();
            sum += number;

            average = sum / number;
        }
        System.out.println("\nResultado da soma: " + sum);
        System.out.println("Resultado da média: " + average);
    }
}