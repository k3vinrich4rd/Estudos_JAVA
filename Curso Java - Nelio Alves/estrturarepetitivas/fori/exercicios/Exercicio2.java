package estrturarepetitivas.fori.exercicios;
/*
Leia um valor inteiro N. este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão no intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out." para fora do intervalo).
 */
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            if (x >= 10 && x <= 20) {
                in += 1;
            } else {
                out += 1;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
        input.close();

    }
}
