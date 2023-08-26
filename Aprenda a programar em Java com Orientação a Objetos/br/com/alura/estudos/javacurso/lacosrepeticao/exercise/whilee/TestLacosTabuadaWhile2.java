package br.com.alura.estudos.javacurso.lacosrepeticao.exercise.whilee;

import java.util.Scanner;

public class TestLacosTabuadaWhile2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numerador: ");

        int multiplicador = input.nextInt();
        int resultado;

        int count = 0;
        while (count < multiplicador) {
            count++;
            resultado = count * multiplicador;
            System.out.println(count + " x " + multiplicador + " = " + resultado);
        }
    }
}