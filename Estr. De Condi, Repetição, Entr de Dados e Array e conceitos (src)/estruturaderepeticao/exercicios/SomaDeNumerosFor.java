package estruturaderepeticao.exercicios;
// Exercício Web: Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses
//números.
import java.util.Scanner;

public class SomaDeNumerosFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite 10, para calcular a soma de 10 números: ");
        int numeros = entrada.nextInt();

        int valor = 0;
        int soma = 0;
        // Estrutura de repetição:
        for (int contador = 0; contador < numeros; contador++) { // ligação de contador com números
            Scanner entrada1 = new Scanner(System.in);
            System.out.print("Digite o " + (contador + 1)  + "º número: ");
            valor = entrada.nextInt();
            soma += valor;
        }
        System.out.println("O resultado da soma dos números é: " + soma);


    }
}
