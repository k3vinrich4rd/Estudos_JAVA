package estrturarepetitivas.exercicio;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int axleX = input.nextInt();
        int axleY = input.nextInt();

        while (axleX != 0 && axleY != 0) {
            if (axleX > 0 && axleY > 0) {
                System.out.println("First");
                axleX = input.nextInt();
                axleY = input.nextInt();
            } else if (axleX < 0 && axleY > 0) {
                System.out.println("Second");
                axleX = input.nextInt();
                axleY = input.nextInt();
            } else if (axleX < 0) {
                System.out.println("Third");
                axleX = input.nextInt();
                axleY = input.nextInt();
            } else {
                System.out.println("Fourth");
                axleX = input.nextInt();
                axleY = input.nextInt();
            }
        }
        input.close();
    }
}
