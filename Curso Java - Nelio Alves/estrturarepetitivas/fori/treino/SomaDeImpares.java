package estrturarepetitivas.fori.treino;

import java.util.Scanner;

public class SomaDeImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        int min, max;
        if (x < y) {
            min = x;
            max = y;
        } else {
            min = y;
            max = x;
        }
        int sum = 0;
        for (int i = min + 1; i < max; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
        input.close();
    }
}
