package funcoesjava;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();

        int higher = max(firstNumber, secondNumber, thirdNumber);
        showResult(higher);


        input.close();
    }

    public static int max(int firstNumber, int secondNumber, int thirdNumber) {
        int aux;
        if ((firstNumber > secondNumber) && firstNumber > thirdNumber) {
            aux = firstNumber;
        } else if ((secondNumber > firstNumber) && secondNumber > thirdNumber) {
            aux = secondNumber;
        } else {
            aux = thirdNumber;
        }
        return aux;
    }

    public static void showResult(int higher) {
        System.out.println("Higher = " + higher);
    }

}
