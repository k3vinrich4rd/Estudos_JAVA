package br.com.alura.estudos.javacurso.lacosrepeticao.exercise.fori;

import java.util.Scanner;

public class TestLacosTabuada2ForI {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find its multiplication: ");
        int number = input.nextInt();
        int multiple;

        for (int i = 0; i <= 10; i++) {
            multiple = i * number;
            System.out.println(i + " x " + number + " = " + multiple);
        }
    }
}