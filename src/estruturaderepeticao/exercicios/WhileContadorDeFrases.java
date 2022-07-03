package estruturaderepeticao.exercicios;

import java.util.Scanner;

public class WhileContadorDeFrases {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();
        entrada.close();

        int contador = 1;
        while (contador <= numero) {
            System.out.println(contador + " Kevin lindo");
            contador++;

        }
        System.out.println("Fim do programa.");
    }
}
