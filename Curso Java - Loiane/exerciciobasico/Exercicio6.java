package exerciciobasico;

import java.util.Scanner;

public class Exercicio6 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Informe o valor do raio do circulo: ");
        double raio = input.nextDouble();
        input.close();

        double area = Math.PI * Math.pow(raio,2);
        System.out.printf("O valor da área do circulo é: %.2f "  , area);
    }
}
