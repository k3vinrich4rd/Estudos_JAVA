package br.com.alura.estudos.javacurso.lacosrepeticao.exercise.fori;/*
Leia 1 valor inteiro N, que representa o número de casos de teste que segue. Cada caso de teste consiste
em 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.
 */
import java.util.Scanner;
public class MediaComTresValores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um valor para representar a quantidade de testes : ");
        int valueN = input.nextInt();

        double average = 0;

        for (int i = 0; i < valueN; i++) {
            System.out.println("Digite as notas do " + (i + 1) + "º caso de testes :");

            System.out.print((1) + "° nota: ");
            double firstValue = input.nextDouble();
            System.out.print((2) + "º nota: ");
            double secondValue = input.nextDouble();
            System.out.print((3) + "º nota: ");
            double thirdValue = input.nextDouble();

            average = (firstValue * 2.0 + secondValue * 3.0 + thirdValue * 5.0) / 10.0;
        }
        System.out.printf("\nMedia ponderada: %.1f ", average);
    }
}