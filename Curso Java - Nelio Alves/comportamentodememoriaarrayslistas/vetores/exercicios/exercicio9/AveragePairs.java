package comportamentodememoriaarrayslistas.vetores.exercicios.exercicio9;

import java.util.Scanner;

public class AveragePairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many elements will the vector have? ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter " + (i + 1) + "º number: ");
            numbers[i] = input.nextInt();
        }

        int numbersPairs = 0;
        int sumPairs = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sumPairs += numbers[i];
                numbersPairs++;
            }
        }

        double averagePairs = (double) sumPairs / numbersPairs;
        System.out.printf("AVERAGE PAIRS = %.1f", averagePairs);
        input.close();
    }
}
