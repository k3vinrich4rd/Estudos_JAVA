package exerciciobasico;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        System.out.print("Informe um número em metros e saiba sua conversão em centímetros: ");
        double metros = input.nextInt();
        input.close();

        double centimetros = metros * 100;
        System.out.println("O resultado da conversão do número é " + centimetros + " cm");

    }
}
