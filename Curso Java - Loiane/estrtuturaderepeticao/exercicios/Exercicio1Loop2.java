package estrtuturaderepeticao.exercicios;

import java.util.Scanner;

public class Exercicio1Loop2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.print("Digite uma nota entre 0 e 10: ");
            double nota = input.nextDouble();

            if (nota >= 0 && nota <= 10) {
                System.out.println("Você digitou: " + nota);
            } else {
                System.out.println("Nota inválida, digite novamente\n");
            }

        }
    }
}
