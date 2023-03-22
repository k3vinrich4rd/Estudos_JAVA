package br.com.alura.estudos.javacurso.lacosrepeticao.exercise.whilee;

import java.util.Scanner;

public class Acesso3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Inform your name or s to quit: ");
        String name = input.nextLine();
        int sum = 0;

        while (!name.equalsIgnoreCase("s")) {
            System.out.println("Welcome " + name);
            System.out.print("Inform your name or s to quit: ");
            name = input.nextLine();
            sum++;
        }
        System.out.println("\nEnd of execution!");
        System.out.println("You typed you name " + sum + " times");
        input.close();
    }
}