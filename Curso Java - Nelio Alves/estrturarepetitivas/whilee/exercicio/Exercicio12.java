package estrturarepetitivas.whilee.exercicio;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inform your name or s to quit: ");
        String name = input.nextLine();
        int sum = 0;

        while (!name.equalsIgnoreCase("s")) {
            System.out.println("Welcome " + name);
            System.out.print("Inform your name or s to quit: ");
            name = input.nextLine();
            sum++;
        }
        System.out.println("End of execution!");
        System.out.println("You typed your name " + sum + " times");
    }
}
