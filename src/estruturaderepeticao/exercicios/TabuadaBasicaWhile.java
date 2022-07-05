package estruturaderepeticao.exercicios;
//Utilizando estrutura de repetição (While):
// Tabuada básica com o While
import java.util.Scanner;

public class TabuadaBasicaWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número e saiba a sua tabuada: ");
        int nunmeroDeEntrada = entrada.nextInt();
        entrada.close();

        int multiplicador = 1;
        // Estrutura de repetição:
        while (multiplicador <= 10) {

            int resultado = nunmeroDeEntrada * multiplicador;
            System.out.println(nunmeroDeEntrada + " x " + multiplicador + " = " + resultado);
            multiplicador++;
        }

    }
}
