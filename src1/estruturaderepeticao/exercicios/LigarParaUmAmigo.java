package estruturaderepeticao.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

//Ligando para um amigo
public class LigarParaUmAmigo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String repostasDoUsuario = "";
        double numeroDigitado = 0;
        ;

        System.out.print("Você tem um telefone ou celular para efetuar uma ligação [S]im / [N]ão: ");
        repostasDoUsuario = input.next();


        do {

            if (repostasDoUsuario.equalsIgnoreCase("s")) {
                System.out.print("Digite o número: ");
                numeroDigitado = input.nextDouble();
                if (numeroDigitado < 0) {
                    System.out.println("Número inválido informe um número com 11 digitos");

                }
            } else {
                System.out.print("Tenha um celular ou número de telefone para efetuar uma ligação\n " +
                        "\nVocê já tem um número? [S]im / [N]ão:  ");
                repostasDoUsuario = input.next();
                if (repostasDoUsuario.equalsIgnoreCase("s")) ;
                System.out.print("Digite um número: ");
                numeroDigitado = input.nextDouble();
            }

            System.out.print("A pessoa que você ligou te atendeu [S]im / [N]ão: ");
            repostasDoUsuario = input.next();
            if (repostasDoUsuario.equalsIgnoreCase("s")) {
                System.out.println("Que bom, você efetuou a sua ligação");
            } else {
                System.out.println("Que pena... talvez o número esteja ocupado, tente novamente");

            }

            System.out.print("Você deseja fazer mais alguma ligação? ");
            repostasDoUsuario = input.next();
        } while (repostasDoUsuario.equalsIgnoreCase("s"));
        System.out.println("Fechando o programa...");
        

    }

}













