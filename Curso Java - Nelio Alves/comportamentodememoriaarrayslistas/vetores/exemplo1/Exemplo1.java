package comportamentodememoriaarrayslistas.vetores.exemplo1;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter one number and calculate the average of heights entered: ");
        int n = input.nextInt();

        double[] heightOfPeople = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + "º height value: ");
            heightOfPeople[i] = input.nextDouble();
        }

        double sum = 0.0;

        for (int i = 0; i < n; ++i) {
            sum += heightOfPeople[i];

        }
        double average = sum / n;
        System.out.printf("AVERAGE HEIGHT: %.2f ", average);

        input.close();
    }
}
