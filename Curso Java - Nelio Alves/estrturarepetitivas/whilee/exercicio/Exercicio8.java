package estrturarepetitivas.whilee.exercicio;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        int count = 0;
        while (count != 10) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter 10 to end the program: ");
            count = input.nextInt();
        }
        System.out.println("The end");

    }
}
