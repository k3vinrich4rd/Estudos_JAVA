package comportamentodememoriaarrayslistas.vetores.exercicios.exercicio12;

import java.util.Scanner;

public class PeopleData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many students will be entered? ");
        int n = input.nextInt();

        double[] height = new double[n];
        char[] genres = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Height of " + (i + 1) + "º people: ");
            height[i] = input.nextDouble();
            System.out.print("Gender of " + (i + 1) + "º people: ");
            genres[i] = input.next().charAt(0);
        }

        double shortestHeight = height[0];
        double greaterHeight = height[0];


        for (int i = 0; i < n; i++) {
            if (height[i] > greaterHeight) {
                greaterHeight = height[i];
            }
            if (height[i] < shortestHeight) {
                shortestHeight = height[i];
            }
        }

        int quantityMen = 0;
        int quantityWoman = 0;
        double femaleHeight = 0;

        for (int i = 0; i < n; i++) {
            if (genres[i] == 'M') {
                quantityMen++;
            } else {
                quantityWoman++;
                femaleHeight += height[i];
            }
        }

        double mediumHeightFemale = femaleHeight / quantityWoman;

        System.out.printf("Menor altura = %.2f\n", shortestHeight);
        System.out.printf("Maior altura = %.2f\n", greaterHeight);
        System.out.printf("Media das alturas das mulheres = %.2f\n", mediumHeightFemale);
        System.out.printf("Numero de homens = %d\n", quantityMen);

        input.close();
    }
}
