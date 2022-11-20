package comportamentodememoriaarrayslistas.matriz;

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        //Maneira de instanciar
        int[][] numbers = new int[n][n];

        //Para ler uma matriz é necessário fazer dois for
        for (int i = 0; i < numbers.length; i++) { //Para linha
            for (int j = 0; j < numbers[i].length; j++) { // Para coluna
                numbers[i][j] = input.nextInt();
            }
        }

        //Os elementos da diagonal sempre vão ter o valor da linha e coluna iguais
        System.out.println("Main diagonal:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i][i] + " ");
        }


        int cont = 0;
        for (int i = 0; i < numbers.length; i++) {  //numbers.length (linha)
            for (int j = 0; j < numbers[i].length; j++) { // numbers[i].length Coluna
                if (numbers[i][j] < 0) {
                    cont++;
                }
            }
        }
        System.out.println("\nNegative numbers = " + cont);

        input.close();
    }
}
