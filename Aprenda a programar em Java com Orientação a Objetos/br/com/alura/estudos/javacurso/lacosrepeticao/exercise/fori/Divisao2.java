package br.com.alura.estudos.javacurso.lacosrepeticao.exercise.fori;

import java.util.Scanner;

/*
Ler um número inteiro N e calcular todos os seus divisores
 */
public class Divisao2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número para saber seus divisores: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        input.close();

    }
}