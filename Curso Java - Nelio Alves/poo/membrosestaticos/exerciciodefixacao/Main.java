package poo.membrosestaticos.exerciciodefixacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the dollar price? "); // Qual � o pre�o do d�lar?
        CurrencyConverter.priceDollar = input.nextDouble();
        System.out.print("How many dollars will be bought? "); // Quantos d�lares ser�o comprados?
        CurrencyConverter.amountOfDollarsPurchased = input.nextDouble();
        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.amountToBePaidInReais()); //Valor a ser pago em reais
    }
}
