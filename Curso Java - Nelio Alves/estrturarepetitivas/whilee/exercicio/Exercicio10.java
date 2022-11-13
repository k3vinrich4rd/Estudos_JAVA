package estrturarepetitivas.whilee.exercicio;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        while (a < 1 || b > 6){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number between 1 and 6");
            System.out.print("Firs number: ");
            a = input.nextInt();
            System.out.print("Second number: ");
            b = input.nextInt();
        }
        System.out.println("\nThe end");
    }
}
