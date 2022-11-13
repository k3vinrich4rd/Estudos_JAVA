package estrturarepetitivas.whilee.exercicio;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        while (a < 10 || b < 10) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter value greater than 10 ");
            System.out.print("First value: ");
            a = input.nextInt();
            System.out.print("Second value: ");
            b = input.nextInt();

        }
        System.out.println("The end");
    }
}
