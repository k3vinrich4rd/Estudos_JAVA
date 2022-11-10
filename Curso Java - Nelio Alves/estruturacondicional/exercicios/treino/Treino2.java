package estruturacondicional.exercicios.treino;

import java.util.Scanner;
//Proposta do código: Efetuar a formulá de bhaskara
//Formula de Bhaskara
//Delta não pode ser negativo
//A não pode ser zero
public class Treino2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double delta = b * b - 4.0 * a * c;

        if (a == 0 || delta < 0.0) {
            System.out.println("Impossible to calculate");
        } else {
            double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);
            //Colocando a precedência porque a divisão e multiplicação, tem a mesma precedência
        }


    }
}
