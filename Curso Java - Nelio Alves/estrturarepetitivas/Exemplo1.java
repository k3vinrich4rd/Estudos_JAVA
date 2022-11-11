package estrturarepetitivas;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int soma = 0;
        while (number != 0) {
            soma += number;
            number = input.nextInt();

        }
        System.out.println(soma);
        input.close();
    }
}
