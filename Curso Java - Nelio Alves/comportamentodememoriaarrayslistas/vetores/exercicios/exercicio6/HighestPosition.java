package comportamentodememoriaarrayslistas.vetores.exercicios.exercicio6;

import java.util.Scanner;

public class HighestPosition { //Posição do maior valor
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers are you going to type? ");
        double n = input.nextDouble();

        double[] numbers = new double[(int) n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter " + (i + 1) + "º number: ");
            numbers[i] = input.nextDouble();
        }

        double largerValue = numbers[0];
        double higherPosition = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largerValue) {
                largerValue = numbers[i];
                higherPosition = i;
            }
        }
        input.close();

        System.out.printf("HIGHEST VALUE = %.1f\n", largerValue);
        System.out.print("POSITION OF THE GREATEST VALUE = " + higherPosition);


    }
}
