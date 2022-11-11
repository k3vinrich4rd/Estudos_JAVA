package estrturarepetitivas.treino;

import java.util.Scanner;

public class Treino2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        int sum = 0;
        int cont = 0;

        while (age >= 0) {
            sum += age;
            cont += 1;
            age = input.nextInt();
        }

        if (cont > 0) {
            double average = (double) sum / cont;
            System.out.printf("%.2f", average);
        } else {
            System.out.println("Impossivel calcular");
        }


        input.close();
    }
}
