package estrturarepetitivas.whilee.exercicio.treinowhile;

import java.util.Scanner;

public class Treino1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();

        while (firstNumber != secondNumber) {
            if (firstNumber < secondNumber) {
                System.out.println("Growing");

            } else {
                System.out.println("Descending");
            }
            firstNumber = input.nextInt();
            secondNumber = input.nextInt();

        }
        input.close();
    }
}
