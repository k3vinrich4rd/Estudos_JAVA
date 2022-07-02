package exerciciosestruturasderepeticao;

import java.util.Scanner;

public class TabuadaBasicaFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número e saiba a sua tabuada: ");
        int numeroDeEntrada = entrada.nextInt();
        entrada.close();

        for (int multiplicador = 1; multiplicador <= 10 ; multiplicador++) {
            int resultadoDaMultiplicacao = numeroDeEntrada * multiplicador;
            System.out.println(numeroDeEntrada + " x " + multiplicador + " = " + resultadoDaMultiplicacao);



        }
    }
}
