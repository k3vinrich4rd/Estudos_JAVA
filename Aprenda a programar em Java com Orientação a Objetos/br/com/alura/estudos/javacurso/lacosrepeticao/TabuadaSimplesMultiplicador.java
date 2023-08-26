package br.com.alura.estudos.javacurso.lacosrepeticao;

import java.util.Scanner;

public class TabuadaSimplesMultiplicador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numerador: ");
        int numerador = input.nextInt();
        System.out.print("Digite um multiplicador: ");
        int multiplicador = input.nextInt();
        int resultado = numerador * multiplicador;
        System.out.println(numerador + " x " + multiplicador + " = " + resultado);
        input.close();

    }
}
