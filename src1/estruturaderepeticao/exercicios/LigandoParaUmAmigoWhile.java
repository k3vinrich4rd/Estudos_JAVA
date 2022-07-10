package estruturaderepeticao.exercicios;

import java.util.Scanner;

public class LigandoParaUmAmigoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String respostaDoUsuario;
        double numeroDigitado;
        System.out.print("Você deseja fazer uma ligação? [S]im / [N]ão: ");
        respostaDoUsuario = input.next();
        while (respostaDoUsuario.equalsIgnoreCase("s")) {
            System.out.print("Digite um número: ");
            numeroDigitado = input.nextDouble();
            System.out.print("A pessoa que você ligou te atendeu? [S]im / [N]ão: ");
            respostaDoUsuario = input.next();
            if (respostaDoUsuario.equalsIgnoreCase("s")) {
                System.out.println("Que bom você efetuou uma ligação");
            }else {
                System.out.println("Que pena, talvez o número esteja ocupado");
            }
            System.out.print("Você deseja fazer mais alguma ligação? [S]im / [N]ão: ");
            respostaDoUsuario = input.next();
        }
        System.out.println("ok, fechando o programa...");

            }
        }


