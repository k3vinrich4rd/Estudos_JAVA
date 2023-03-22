package br.com.alura.estudos.javacurso.lacosrepeticao.exercise.whilee;

import java.util.Scanner;
//Tem que arrumar
//Mas acredito que não é um erro, repete a condição mesmo finalizada,
// por conta do uso do doWhile

public class Acesso3DoWhile {
    public static void main(String[] args) {

        int sum = 0;
        String name;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Inform your name or s to quit: ");
            name = input.nextLine();
            System.out.println("Welcome " + name);
            sum++;

        }
        while (!name.equalsIgnoreCase("s"));
        System.out.println("\nEnd of execution!");
        System.out.println("You typed you name " + sum + " times");
        input.close();
    }
}
