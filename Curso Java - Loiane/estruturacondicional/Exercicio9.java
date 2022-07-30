package estruturacondicional;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero1 = input.nextInt();
        System.out.print("Digite um segundo número: ");
        int numero2 = input.nextInt();
        System.out.print("Digite um terceiro número: ");
        int numero3 = input.nextInt();
        input.close();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println(numero1 + " - " + numero2 + " - " + numero3);
            //Numero 1: Maior
        }else if (numero2 > numero1 && numero2 > numero3){
            System.out.println(numero2 + " - " + numero1 + " - " + numero3);
            //Numero 2: Maior
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println(numero3 + " - " + numero2 + " - " + numero1);
            //Numero 3: Maior


        }

    }
}