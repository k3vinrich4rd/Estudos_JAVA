package estruturacondicional;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a sua primeira nota: ");
        double nota1 = input.nextDouble();
        System.out.print("Digite a sua segunda nota: ");
        double nota2 = input.nextDouble();
        input.close();


        double media = (nota1 + nota2) / 2;
        if (media >= 7 && media < 10) {
            System.out.println("Aprovado");
        } else if (nota1 < 0) {
            System.out.println("Número inválido, digite novamente");
        } else if (media < 7) {
            System.out.println("Reprovado");
        } else if (media == 10) {
            System.out.println("Aprovado com distinção");
        }
    }
}

