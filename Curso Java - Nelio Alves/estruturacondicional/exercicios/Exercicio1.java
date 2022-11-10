package estruturacondicional.exercicios;

import java.util.Scanner;
/*
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
 */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int negativeNumber = input.nextInt();

        if (negativeNumber < 0) {
            System.out.println("NEGATIVE");
        } else {
            System.out.println("NO NEGATIVE");
        }
        input.close();

    }
}
