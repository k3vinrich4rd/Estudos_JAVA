package arrayvetores.exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int [] vetorA = new int[10];
        int [] vetorB = new int[vetorA.length];

        for (int i = 0 ; i < vetorA.length; i++){
            System.out.print("Informe o valor da posição " + i + "º do vetor A: ");
            vetorA[i] = input.nextInt();

            vetorB[i] = vetorA[i] % 2;

        }
        System.out.println();

        System.out.print("Valor do vetor A: ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " - ");
        }
        System.out.println();

        System.out.print("Valor do vetor B: ");
        for(int i = 0; i <vetorB.length; i++){
            System.out.print(vetorB[i] + " - ");
        }
    }
}
