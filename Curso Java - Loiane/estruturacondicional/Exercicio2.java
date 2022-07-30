package estruturacondicional;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um número: ");
        double numero = input.nextDouble();
        input.close();

        if (numero >= 0){
            System.out.println("O número digitado que foi o " + numero + ", é positivo");
        }else {
            System.out.println("O número digitado que foi o " + numero + ", é negativo");
        }
    }
}
