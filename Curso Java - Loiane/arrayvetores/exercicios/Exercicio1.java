package arrayvetores.exercicios;

import java.util.Scanner;

// Criando dois vetores com os mesmos tipos, valores e elementos:
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] VetorA = new int[5];
        int[] VetorB = new int[VetorA.length];


        for (int i = 0; i < VetorA.length; i++) {

            System.out.print("Informe o valor da posição " + i + ": ");
            VetorA[i] = input.nextInt();
            VetorB[i] = VetorA[i];
        }
        System.out.println();

        System.out.print("Vetor A = ");
        for (int i = 0; i < VetorA.length; i++) {
            System.out.print(VetorA[i] + " ");

        }
        System.out.println();
        System.out.print("Vetor B = ");
        for (int i = 0; i < VetorB.length; i++) {
            System.out.print(VetorB[i] + " ");

        }
    }
}
