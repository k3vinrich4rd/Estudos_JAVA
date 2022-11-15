package estrturarepetitivas.fori.exercicios;
/*
Leia 1 valor inteiro N, que representa o número de casos de teste que segue. Cada caso de teste consiste
em 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.
 */
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        double media = 0;
        for (int i = 0; i < n; i++) {
            double firstValue = input.nextDouble();
            double secondValue = input.nextDouble();
            double thirdValue = input.nextDouble();

            media = (firstValue * 2.0 + secondValue * 3.0 + thirdValue * 5.0) / 10.0;

            System.out.printf("%.1f ", media);
        }
        input.close();
    }
}
