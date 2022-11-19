package comportamentodememoriaarrayslistas.vetores.exercicios.exercicio1;

import java.util.Scanner;

public class Negatives { //Números não negativos
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many numbers you are going to enter: ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("\nEnter " + (i + 1) + "º number: ");
            numbers[i] = input.nextInt();
        }

        System.out.println("NEGATIVE NUMBERS: ");
        for (int i = 0; i < numbers.length; ++i) {
            if (numbers[i] < 0) {
                System.out.println(numbers[i]);
            }
        }
        input.close();
    }
}
