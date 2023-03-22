package br.com.alura.estudos.javacurso.lacosrepeticao.exercise.fori;

import java.util.Scanner;

public class LendoUmValorInteiro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to know its odd numbers from 1 to 100: ");
        int number = input.nextInt();

        for (int i = 0; i < number; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        input.close();
    }
}