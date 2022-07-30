package estruturacondicional;

import java.util.Scanner;

public class Exercicio1 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Digite o primeiro número: ");
        double numero1 = input.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numero2 = input.nextDouble();

        if (numero1 > numero2){
            System.out.println("O primeiro número informado que foi o " + numero1 + ", é maior que o segundo número que foi o " + numero2 );
        }else {
                System.out.println("O segundo número informado que foi o " + numero2 + ", é maior que o primeiro número que foi o " + numero1);
        }

    }
}
