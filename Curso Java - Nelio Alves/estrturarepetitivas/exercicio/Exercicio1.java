package estrturarepetitivas.exercicio;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int password = input.nextInt();

        while (password != 2002) {
            System.out.println("Invalid password");
            password = input.nextInt();
        }
        System.out.println("Access permitted");
        input.close();
    }
}
