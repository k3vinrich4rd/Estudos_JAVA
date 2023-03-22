package br.com.alura.estudos.javacurso.lacosrepeticao.exercise.fori;

import java.util.Scanner;

public class InteiroPositivo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número para saber o seu valor elevado ao quadrado e ao cubo: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            int square = i * i;
            int cube = i * i * i;

            System.out.printf("%d %d %d\n", i, square, cube);
        }
        input.close();
    }
}