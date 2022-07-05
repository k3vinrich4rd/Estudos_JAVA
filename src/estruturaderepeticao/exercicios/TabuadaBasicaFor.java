package estruturaderepeticao.exercicios;
// Utilizando a estrutura de repetição (for):
// Tabuada básica com For
import java.util.Scanner;

public class TabuadaBasicaFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número e saiba a sua tabuada: ");
        int numeroDeEntrada = entrada.nextInt();
        entrada.close();
        // Estrutura de repetição:
        for (int multiplicador = 1; multiplicador <= 10 ; multiplicador++) {
            int resultadoDaMultiplicacao = numeroDeEntrada * multiplicador;
            System.out.println(numeroDeEntrada + " x " + multiplicador + " = " + resultadoDaMultiplicacao);



        }
    }
}
