package estrturarepetitivas.fori.exercicios;
/*
Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.
 */
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int fat = 1;
        for (int i = 1; i <= n; i++) {
            fat = fat * i;

        }
        System.out.println(fat);
        input.close();
    }

}
