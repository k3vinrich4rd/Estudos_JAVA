package estruturacondicional.exercicios.treino;

import java.util.Scanner;

//Proposta do código: Somar as notas e se foi inferior a 60,00 exibir na tela com uma mensagem
public class Treino1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double noteOne = input.nextDouble();
        double noteSecond = input.nextDouble();

        double finalNote = noteOne + noteSecond;

        if (finalNote < 60.00) {
            System.out.printf("FINAL NOTE = %.1f\n", finalNote);
            System.out.println("DISAPPROVED");
        } else {
            System.out.printf("FINAL NOTE = %.1f ", finalNote);
        }

    }
}
