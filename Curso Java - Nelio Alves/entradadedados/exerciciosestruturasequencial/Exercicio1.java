package entradadedados.exerciciosestruturasequencial;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();

        int soma = firstNumber + secondNumber;

        System.out.println("SOMA = " + soma);

        input.close();

    }
}
