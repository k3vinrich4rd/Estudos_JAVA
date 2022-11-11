package estrturarepetitivas.exerciciowhile;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: " );
        String name = input.nextLine();
        int cont = 1;
        while (cont <= 10) {
            System.out.println(name);
            cont++;
        }

    }
}
