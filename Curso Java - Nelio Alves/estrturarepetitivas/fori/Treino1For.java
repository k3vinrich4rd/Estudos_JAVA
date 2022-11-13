package estrturarepetitivas.fori;

import java.util.Scanner;

public class Treino1For {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int sun = 0;
        for (int i = 0; i < N; i++) {
            int x = input.nextInt();
            sun += x;
        }
        System.out.println(sun);
        input.close();
    }
}
