package estruturaderepeticao.exercicios;
// Utilizando estrutura de repetição (Do while)
import java.util.Scanner;

public class ContadorDeFrasesDoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();
        entrada.close();

        int contador = 1;
        // Estrutura de repetição:
        do {
            System.out.println(contador + " Kevin lindo");
            contador++;
        } while (contador <= numero);
        {


        }
    }
}