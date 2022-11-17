package exerciciosbasicos;
/*
18 - Crie um algoritmo que leia dois valores (x e y) representando um intervalo.
Em seguida, leia um novo valor (z) e verifique se z pertence ao intervalo [x, y].
 */

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers and know their ranges");
        System.out.print("Enter first number: ");
        int x = input.nextInt();
        System.out.print("Enter second number: ");
        int y = input.nextInt();
        System.out.print("Enter third number: ");
        int z = input.nextInt();

        if (z < x || z > y) {
            System.out.println("Value is out of range");

        } else {
            System.out.println("The value is within the range");
            input.close();
        }
    }
}

