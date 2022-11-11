package estruturacondicional.exercicios.treino;

import java.util.Scanner;

public class Treino4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minutes = input.nextInt();
        double valueAccount = 50.0;

        if (minutes > 100) {
            valueAccount += (minutes - 100) * 2.0;
            System.out.printf("Amount Payable: R$ %.2f ", valueAccount);
        } else {
            System.out.printf("Amount Payable: R$: %.2f", valueAccount);
        }
    }
}
