package br.com.alura.estudos.javacurso.lacosrepeticao.exercise.whilee;

import java.util.Scanner;

public class ImprimindoFraseRepetidaNaFrase3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter you name: ");
        String name = input.nextLine();
        System.out.print("Digite um número: ");
        int number = input.nextInt();

        int cont = 0;
        while (cont < number) {
            System.out.println(name);
            cont++;
        }
    }
}