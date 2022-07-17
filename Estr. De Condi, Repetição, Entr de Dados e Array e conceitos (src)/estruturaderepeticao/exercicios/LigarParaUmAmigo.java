package estruturaderepeticao.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Ligando para um amigo
public class LigarParaUmAmigo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String repostasDoUsuario = "";
        double numeroDigitado = 0;

        List<String> ligacoesEfetuadas = new ArrayList<>();

        System.out.print("Você tem um telefone ou celular para efetuar uma ligação [S]im / [N]ão: ");
        repostasDoUsuario = input.next();
        int contadorDeLigacoes = 0;


        // Estrutura de repetição:
        do {

            //Estruturas de condição:
            if (repostasDoUsuario.equalsIgnoreCase("s")) {
                System.out.print("Digite o número: "); // número que vai ser informado
                numeroDigitado = input.nextDouble();
                //Estruturas de condição:
                if (numeroDigitado < 0) {
                    System.out.println("Número inválido informe um número com 11 digitos");

                }
                //Estruturas de condição:
            } else {
                System.out.print("Tenha um celular ou número de telefone para efetuar uma ligação\n " +
                        "\nVocê já tem um celular ou número? [S]im / [N]ão:  ");  // texto de interação
                repostasDoUsuario = input.next();
                //Estruturas de condição:
                if (repostasDoUsuario.equalsIgnoreCase("s")) ;
                System.out.print("Digite um número: ");
                numeroDigitado = input.nextDouble();
            }

            System.out.print("A pessoa que você ligou te atendeu [S]im / [N]ão: ");  // texto de interação
            repostasDoUsuario = input.next();
            //Estruturas de condição:
            if (repostasDoUsuario.equalsIgnoreCase("s")) {
                ligacoesEfetuadas.add("s");
                contadorDeLigacoes += 1;
                System.out.println("Que bom, você efetuou a sua ligação");  // texto de interação
                //Estruturas de condição:
            } else {
                System.out.println("Que pena... talvez o número esteja ocupado, tente novamente");
                ligacoesEfetuadas.add("n");
                // texto de interação

            }

            System.out.print("Você deseja fazer mais alguma ligação? "); // texto de interação

            repostasDoUsuario = input.next();
            //Estrutura de repetição:
        } while (repostasDoUsuario.equalsIgnoreCase("s"));

        for (String ligacoes : ligacoesEfetuadas)
            System.out.println(ligacoes);
        System.out.println("Quantidade de ligações feitas " + contadorDeLigacoes);
        System.out.println("Fechando o programa...");


    }

}













