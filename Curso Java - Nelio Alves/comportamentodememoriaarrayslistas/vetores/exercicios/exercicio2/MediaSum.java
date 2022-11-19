package comportamentodememoriaarrayslistas.vetores.exercicios.exercicio2;

import java.util.Scanner;

public class MediaSum { //Média e soma

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Want the amount of numbers you want to know the average: ");
        double numbersAverage = input.nextDouble();

        double[] numbers = new double[(int) numbersAverage];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter " + (i + 1) + "º number: ");
            numbers[i] = input.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double average = sum / numbersAverage;

        System.out.print("\nVALUES = ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%.1f  ", numbers[i]);
        }

        System.out.printf("\nSUM = %.2f\n", sum);
        System.out.printf("AVERAGE = %.2f\n", average);


        input.close();
    }
}
