package estruturacondicional;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o preço do 1º produto: ");
        double produto1 = input.nextDouble();
        System.out.print("Informe o preço do 2º produto: ");
        double produto2 = input.nextDouble();
        System.out.print("Informe o preço do 3º produto: ");
        double produto3 = input.nextDouble();
        input.close();

        if (produto1 < produto2 && produto1 < produto3) {
            System.out.println("O 1º produto é o mais barato, valor: " + produto1 );
        } else if (produto2 < produto1 && produto2 < produto3) {
            System.out.println("O 2º produto é o mais barato, valor: " + produto2 );
        } else if (produto3 < produto1 && produto3 < produto2) {
            System.out.println("O 3º produto é o mais barato, valor: " + produto3 );
        }

    }
}
