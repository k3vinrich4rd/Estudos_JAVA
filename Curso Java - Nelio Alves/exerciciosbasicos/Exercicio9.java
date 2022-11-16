package exerciciosbasicos;

import java.util.Scanner;

/*
9 - Crie um algoritmo que leia as variáveis inteiras x e y e troque o valor destas variáveis.
    Isto é, x deve ficar com o valor de y e y deve ficar com o valor de x.
	Mostre os valores depois da troca.
 */
public class Exercicio9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = input.nextInt();
        System.out.print("Enter the value of y: ");
        int y = input.nextInt();

        int troca = x;
        x = y;
        y = troca;

        System.out.println("X = " + x);
        System.out.println("Y = " + y);

        input.close();


    }
}

