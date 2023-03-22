package br.com.alura.estudos.javacurso.lacosrepeticao.exercise.whilee;

import java.util.Scanner;

public class Acesso2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int password = 0;

        while (password != 10) {
            System.out.println("Enter 10 to end the program");
            password = input.nextInt();
        }
        System.out.println("The end");
        input.close();
    }
}