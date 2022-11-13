package estrturarepetitivas.fori.treino;

import java.util.Scanner;

public class TabuadaFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int multiple = 0;

        for (int i = 1; i <= 10; i++) {
            multiple = i * N;
            System.out.println(i + " x " + N + " = " + multiple);
        }

        input.close();
    }
}
