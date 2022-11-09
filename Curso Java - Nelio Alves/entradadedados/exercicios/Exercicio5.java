package entradadedados.exercicios;

import java.util.Scanner;

/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int partCodeOne = input.nextInt();
        int numberOfPiecesOne = input.nextInt();
        double unitValueOfPartsOne = input.nextDouble();

        int partCodeSecond = input.nextInt();
        int numberOfPiecesSecond = input.nextInt();
        double unitValueOfPartsSecond = input.nextDouble();

        double amountToPlay = (numberOfPiecesOne * unitValueOfPartsOne) +
                (numberOfPiecesSecond * unitValueOfPartsSecond);

        System.out.printf("Amount To Play: R$ %.2f ", amountToPlay);

        input.close();
    }
}
