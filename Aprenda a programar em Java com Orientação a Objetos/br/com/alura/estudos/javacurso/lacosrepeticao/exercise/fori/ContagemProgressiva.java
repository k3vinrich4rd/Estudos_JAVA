package br.com.alura.estudos.javacurso.lacosrepeticao.exercise.fori;

import java.util.Scanner;

public class ContagemProgressiva {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número para fazer uma contagem até esse número: ");
        int number =  input.nextInt();

        for (int i = 0; i < number; i ++) {
            System.out.println("Value the number: " + i);
        }

    }
}