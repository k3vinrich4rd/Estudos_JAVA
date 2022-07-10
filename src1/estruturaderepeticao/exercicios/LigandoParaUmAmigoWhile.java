package estruturaderepeticao.exercicios;
//Utilizando um loop while (enquanto) com estrutura de condição (if) se:
import java.util.Scanner;

public class LigandoParaUmAmigoWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Vai ler os dados de entrada:
        String respostaDoUsuario; // Variável que vai receber o conjunto de caracteres
        double numeroDigitado;
        System.out.print("Você deseja fazer uma ligação? [S]im / [N]ão: "); // texto de interação
        respostaDoUsuario = input.next();
        while (respostaDoUsuario.equalsIgnoreCase("s")) { //Estrutura de repetição
            System.out.print("Digite um número: ");
            numeroDigitado = input.nextDouble();
            System.out.print("A pessoa que você ligou te atendeu? [S]im / [N]ão: "); // texto de interação
            respostaDoUsuario = input.next(); // Variável que vai receber o conjunto de caracteres
            if (respostaDoUsuario.equalsIgnoreCase("s")) {
                System.out.println("Que bom você efetuou uma ligação");
            }else {
                System.out.println("Que pena, talvez o número esteja ocupado");
            }
            System.out.print("Você deseja fazer mais alguma ligação? [S]im / [N]ão: ");
            // Variável que vai receber o conjunto de caracteres
            respostaDoUsuario = input.next();
        }
        System.out.println("ok, fechando o programa...");

            }
        }


