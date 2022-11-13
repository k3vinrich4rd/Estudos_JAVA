package estrturarepetitivas.fori.exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int numerador = input.nextInt();
            int denominador = input.nextInt();

            if (denominador == 0) {
                System.out.println("Divisão impossivel");
            } else {
                double div = (double) numerador / denominador;
                System.out.println(div);
            }
        }
        input.close();
    }
}
