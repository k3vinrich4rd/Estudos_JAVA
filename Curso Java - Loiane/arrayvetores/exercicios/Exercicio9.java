package arrayvetores.exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        double[] vetorC = new double[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Informe o valor da posição " + i + "º do vetor A: ");
            vetorA[i] = input.nextInt();



        }
        System.out.println();

        System.out.print("Valor do vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " - ");

        }
        System.out.println();

        System.out.println();
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("Informe o valor da posição " + i + "º do vetor B: ");
            vetorB[i] = input.nextInt();

            vetorC[i] = (double) vetorA[i] / vetorB[i];
        }
        System.out.println();

        System.out.print("Valor do vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " - ");

        }
        System.out.println();

        System.out.println();
        System.out.print("Valor do vetor C: ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.printf(" - %.2f " , vetorC[i] );
        }

    }
}
