package comportamentodememoriaarrayslistas.vetores.exercicios.exercicio8;

import java.util.Scanner;

public class BelowAverage { //Abaixo da média
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many elements will the vector have? ");
        int n = input.nextInt();

        double[] numbers = new double[n];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter " + (i + 1) + "º number: ");
            numbers[i] = input.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double averageTheVector = sum / n;
        System.out.printf("\nAVERAGE THE VECTOR = %.3f", averageTheVector);

        System.out.println("\nELEMENTS BELOW AVERAGE: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < averageTheVector) {
                System.out.printf("%.1f\n", numbers[i]);
            }
        }


        input.close();
    }
}
