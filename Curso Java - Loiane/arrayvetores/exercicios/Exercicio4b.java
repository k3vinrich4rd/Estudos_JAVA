package arrayvetores.exercicios;

import java.util.Scanner;

public class Exercicio4b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetorA = new int[15];
        double[] vetorB = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Informe o valor da posição " + i + " do vetor A: ");
            vetorA[i] = input.nextInt();

            vetorB[i] = Math.sqrt(vetorA[i]);
            //vetorB[i] = (int) Math.sqrt(vetorA[i]);
            //Math.sqrt = double, por isso tem que fazer o casting
        }
        System.out.println();

        System.out.print("Valor do vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " - ");

        }
        System.out.println();

        System.out.print("Valor do vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.printf(" %.2f - ", vetorB[i]);
        }
        System.out.println();

    }
}
