package exerciciosbasicos;

import java.util.Scanner;

/*
17 - Escreva um algoritmo que leia uma letra que represente o sexo de uma pessoa (M para Masculino e F para feminino).
	 Se for masculino, mostra a mensagem? Seja bem-vindo, Senhor!?, se for feminino, mostra a mensagem ?Seja bem-vinda, Senhora!?.

 */
public class Exercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sex - 'M'(Male) 'F' (Feminine) ");
        System.out.print("Enter your sex: ");
        char x = input.next().charAt(0);

        if (x == 'M' || x == 'm') {
            System.out.println("Welcome Sr. !");

        } else if (x == 'F' || x == 'f') {
            System.out.println("Welcome Mrs!");
        } else {
            System.out.println("Este caractere nao e aceito");
        }
        input.close();

    }
}



