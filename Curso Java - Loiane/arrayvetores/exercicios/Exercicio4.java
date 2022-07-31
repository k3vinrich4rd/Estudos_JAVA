package arrayvetores.exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Informe o valor da posição " + i + " do vetor A: ");
            vetorA[i] = input.nextInt();

            vetorB[i] = (int) Math.sqrt(vetorA[i]);
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
            System.out.print(vetorB[i] + " - ");
        }
        System.out.println();


    }
}
