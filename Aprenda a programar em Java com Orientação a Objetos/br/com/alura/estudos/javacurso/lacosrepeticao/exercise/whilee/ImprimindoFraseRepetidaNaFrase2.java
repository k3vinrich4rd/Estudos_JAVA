package br.com.alura.estudos.javacurso.lacosrepeticao.exercise.whilee;

import java.util.Scanner;

public class ImprimindoFraseRepetidaNaFrase2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter you name: ");
        String name = input.nextLine();

        int cont = 0;
        while (cont <= 10) {
            System.out.println(name);
            cont++;
        }
    }
}