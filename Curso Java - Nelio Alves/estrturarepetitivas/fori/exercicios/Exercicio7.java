package estrturarepetitivas.fori.exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            int second = i * i;
            int third = i * i * i;

            System.out.printf("%d %d %d\n", i, second, third);
        }
        input.close();
    }
}
