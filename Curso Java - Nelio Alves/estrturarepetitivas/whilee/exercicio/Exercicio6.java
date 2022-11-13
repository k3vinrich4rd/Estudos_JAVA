package estrturarepetitivas.whilee.exercicio;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int number = input.nextInt();
        int count = 0;

        while (count < number) { // 0 < 3
            System.out.println(name);
            count++;
        }
        input.close();

    }
}

