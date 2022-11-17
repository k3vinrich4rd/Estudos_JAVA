package exerciciosbasicos;

import java.util.Scanner;

/*
8 - Crie um algoritmo que lê um valor real em dólar, e converte o valor para reais.
	Considere que a cotação é US$ 1 = R$ 1,82.
 */
public class Exercicio8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an amount in dollars to know the conversion into Brazilian real\n");
        System.out.print("Write the desired dollar amount: ");
        double dollar = input.nextDouble();
        double realBrazilian = dollar * 1.82;
        System.out.printf("\nThe result of the conversion into real will be: R$ %.2f ", realBrazilian);
        input.close();


    }
}

