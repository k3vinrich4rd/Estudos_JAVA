package exerciciosestruturasderepeticao;
// Exercício Web: Leia o nome um número do usuário um número N
// e escreva o nome dela(e) tela N vezes.

import java.util.Scanner;
// Utilizando o for
public class ContadorDeNomeFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome;
        nome = entrada.nextLine();
        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();
        // no caso deste exercício o contador se inicia no 0
        // por conta que ele esta contando e não somando
        for (int contador = 0; contador <= numero; contador++) {
            System.out.println(nome);

        }

    }

}

