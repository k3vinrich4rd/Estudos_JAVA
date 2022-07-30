package estruturacondicional;

import java.util.Scanner;


public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double numero1 = input.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numero2 = input.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double numero3 = input.nextDouble();
        input.close();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("Dos números informados o número " + numero1 + " é o maior deles");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("Dos números informados o número " + numero2 + " é o maior deles");
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("Dos números informados o número " + numero3 + " é o maior deles");
        }


    }
}

