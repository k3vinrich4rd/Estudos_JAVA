package estruturacondicional.exercicios;

import java.util.Scanner;
/*
Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 */
public class Exercicio2 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number % 2 == 0){ // Se o resto da divisão for igual a 0 é par
            System.out.println("PAIR");
        }else {
            System.out.println("ODD");
        }
    }
}
