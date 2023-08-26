package br.com.alura.estudos.javacurso.lacosrepeticao.exercise.fori;

import java.util.Scanner;

public class TestLacosTabuada2ForI2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numerador: ");
        int multiplicador = input.nextInt();

        int resultado;

        for (int i = 0; i <= 10; i++) {
         resultado = i * multiplicador;
         System.out.println(i + " x " + multiplicador + " = " + resultado);

        }
    }
}