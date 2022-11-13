package estrturarepetitivas.fori.treino;

import java.util.Scanner;

public class SomandoNumerosAnteriores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        String prefixo;
        int sum = 0;

        for (int i = 0; i < number; ++i) {
            sum += i;

            if (sum % 2 == 0) {
                prefixo = "Par | ";
            } else {
                prefixo = "Impar | ";
            }
            System.out.println(prefixo + sum);
        }
        System.out.println("Result the sum this numbers " + sum);
    }

}
