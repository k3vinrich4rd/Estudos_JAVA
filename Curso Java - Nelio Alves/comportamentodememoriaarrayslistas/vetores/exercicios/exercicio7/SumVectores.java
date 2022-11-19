package comportamentodememoriaarrayslistas.vetores.exercicios.exercicio7;

import java.util.Scanner;

public class SumVectores { //Soma dos vetores
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many values will each vector have? ");
        int n = input.nextInt();

        int[] vectorA = new int[n];
        int[] vectorB = new int[n];

        System.out.println("Enter the values of vector A: ");
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = input.nextInt();
        }

        System.out.println("Enter the value of vector B: ");
        for (int i = 0; i < vectorB.length; i++) {

            vectorB[i] = input.nextInt();
        }

        System.out.println("RESULTING VECTOR: ");
        for (int i = 0; i < n; i++) {
           int soma = vectorA[i] + vectorB[i];
            System.out.println(soma);
        }
        input.close();
    }

}
