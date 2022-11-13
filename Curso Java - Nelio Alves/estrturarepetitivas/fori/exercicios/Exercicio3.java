package estrturarepetitivas.fori.exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        double media = 0;
        for (int i = 0; i < n; i++) {
            double firstValue = input.nextDouble();
            double secondValue = input.nextDouble();
            double thirdValue = input.nextDouble();

            media = (firstValue * 2.0 + secondValue * 3.0 + thirdValue * 5.0) / 10.0;

            System.out.printf("%.1f ", media);
        }
        input.close();
    }
}
