package br.com.alura.estudos.javacurso.lacosrepeticao.exercise.fori;

import java.util.Scanner;

/*
Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 */
public class Divisao {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número que represente a quantidade de divisões que deseja fazer: ");
        int n = input.nextInt();


        for (int i = 0; i < n; i++) {
            System.out.println("\nDigite os dados referentes a " + (i + 1) + "º divisão: ");
            System.out.print("Digite o numerador: ");
            int numerador = input.nextInt();
            System.out.print("Digite o denominador: ");
            int denominador = input.nextInt();

            if (denominador == 0) {
                System.out.println("Divisão impossível");
            } else if (numerador == 0) {
                System.out.println("Resultado da divisão: " + numerador);

            } else {
                double divisao = (double) numerador / denominador;
                System.out.println("Resultado da divisão: " + divisao);
            }

        }
        input.close();

    }
}