package estruturaderepeticao.exercicios;
// Utilizando estrutura de repetição (do while):
import java.util.Scanner;

public class DoWhileCondicao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nomeDoUsuario;
        String respostaDoUsuario;
        // Estrutura de repetição:
        do {
            System.out.print("Digite seu nome: ");
            nomeDoUsuario = entrada.nextLine();
            System.out.println("Bem vindo " + nomeDoUsuario);
            // loop
            System.out.println("Quer continuar? [Sim/Não]");
            respostaDoUsuario = entrada.nextLine();
        } while (respostaDoUsuario.equalsIgnoreCase("sim"));
        System.out.println("Tchau " + nomeDoUsuario +", volte sempre!");

    }


}

