package estruturaderepeticao.exercicios;
// Utilizando estrutura de repetição (while)
import java.util.Scanner;

public class WhileCondicao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome ou digite sim para sair: ");
        String nome;
        nome = entrada.nextLine();
        // Estrutura de repetição com o while:
        while (!nome.equalsIgnoreCase("Sim")) {
            System.out.println("Seja bem vindo " + nome);
            System.out.print("Digite seu nome ou digite sim para sair: ");
            nome = entrada.nextLine();
        }
        System.out.println("Fim do programa.");

    }
}
