package comportamentodememoriaarrayslistas.matriz;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();

        int[][] numbers = new int[m][n];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = input.nextInt();
            }
        }
        int x = input.nextInt();


        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + numbers[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + numbers[i - 1][j]);
                    }
                    if (j < numbers[i].length - 1) {
                        System.out.println("Right: " + numbers[i][j + 1]);
                    }
                    if (i < numbers.length - 1) {
                        System.out.println("Down: " + numbers[i + 1][j]);
                    }
                }

            }

        }
        input.close();
    }
}





