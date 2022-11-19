package comportamentodememoriaarrayslistas.vetores.exercicios.exercicio5;

import java.util.Scanner;

public class NumbersPairs { //Números pares
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers are you going to type? ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter " + (i + 1) + "º number: ");
            numbers[i] = input.nextInt();
        }

        int cont = 0;
        System.out.println("\nPAIR NUMBERS: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                cont ++;
                System.out.print(numbers[i] + "  " );

            }
        }
        System.out.print("\n\nNUMBER OF PAIRS = " + cont);
        input.close();

    }


}
