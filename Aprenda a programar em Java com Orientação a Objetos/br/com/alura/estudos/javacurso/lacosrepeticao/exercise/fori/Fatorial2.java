package br.com.alura.estudos.javacurso.lacosrepeticao.exercise.fori;

import java.util.Scanner;

/*
Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.
 */
public class Fatorial2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número N: ");
        int valueN = input.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= valueN; i++) {
            fatorial *= i;
            System.out.println("O fatorial de " + i + " = " + fatorial);

        }

    }
}