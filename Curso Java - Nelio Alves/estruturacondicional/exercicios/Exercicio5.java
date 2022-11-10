package estruturacondicional.exercicios;

import java.util.Scanner;
/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int itemCode = input.nextInt();
        int quantidade = input.nextInt();

        double total = 0;

        if (itemCode == 1) {
            total = quantidade * 4.00;
        } else if (itemCode == 2) {
            total = quantidade * 4.50;
        } else if (itemCode == 3) {
            total = quantidade * 5.00;
        } else if (itemCode == 4) {
            total = quantidade * 2.00;
        } else {
            total = quantidade * 1.50;
        }

        System.out.printf("Total: R$ %.2f ", total);

        input.close();
    }
}
