package estruturacondicional.exercicios.treino;

import java.util.Scanner;
//Proposta do código: Exibir o menor numero na tela
public class treino3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int oneNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();

        if (oneNumber < secondNumber && oneNumber < thirdNumber) {
            System.out.println("SMALLER = " + oneNumber);
        } else if (secondNumber < oneNumber && secondNumber < thirdNumber) {
            System.out.println("SMALLER = " + secondNumber);
        } else {
            System.out.println("SMALLER = " + thirdNumber);
        }
    }
}