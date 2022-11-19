package comportamentodememoriaarrayslistas.vetores.exercicios.exercicio10;

import java.util.Scanner;

public class Older { //Pessoa mais velha
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many people are you going to type? ");
        int n = input.nextInt();

        String[] names = new String[n];
        int[] age = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Data from " + (i + 1) + "º person: ");
            System.out.print("Name: ");
            names[i] = input.next();
            System.out.print("Age: ");
            age[i] = input.nextInt();
        }

        int ageOfMajority = age[0];
        int higherPosition = 0;


        for (int i = 0; i < n; i++) {
            if (age[i] > ageOfMajority){
                higherPosition = i;
            }
        }

        System.out.printf("\nOLDER PERSON: %s\n", names[higherPosition]);

        input.close();
    }
}
