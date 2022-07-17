package estruturaderepeticao.exercicios;
// Utilizando estrutura de repetição (do while):
import java.util.Scanner;

public class DoWhileSomaDeNumeros {
    public static void main(String[] args) {
        int numero, soma = 0;
        String resposta;
        Scanner numeroDeEntrada = new Scanner(System.in);
        // Estrutura de repetição:
        do {
            System.out.print("Digite um número: ");
            numero = numeroDeEntrada.nextInt();
            soma += numero; // s = s + n;
            System.out.println("Quer continuar? [Sim/Não]");
            resposta = numeroDeEntrada.next(); // resposta do teclado
        }while (resposta.equalsIgnoreCase("sim")); // enquanto a resposta for sim, caso for não, o laço acaba
        System.out.print(" A soma de todos os valores é: " + soma );
        // equals (é igual a )
        // IgnoreCase (Ignore caso)
    }
}
