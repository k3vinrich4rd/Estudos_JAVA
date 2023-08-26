package br.com.alura.estudos.javacurso.lacosrepeticao;

import java.util.Scanner;

public class TabuadaComposta {
    public static void main(String[] args) {

        int primeiroNumero;
        int segundoNumero;
        int soma;
        int multiplicador;
        int subtracao;
        int divisao;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite '1' para somar dois números ");
        System.out.println("Digite '2' para multiplicar dois números");
        System.out.println("Digite '3' para subtrair dois números");
        System.out.println("Digite '4' para dividir dois números");

        System.out.print("\nNumero escolhido: ");
        int resposta = input.nextInt();


        switch (resposta) {
            case 1:
                System.out.print("\nDigite o primeiro número: ");
                primeiroNumero = input.nextInt();
                System.out.print("Digite o segundo número: ");
                segundoNumero = input.nextInt();
                soma = primeiroNumero + segundoNumero;
                System.out.println("Resultado da soma: " + soma);
                break;
            case 2:

                System.out.print("\nDigite o primeiro número: ");
                primeiroNumero = input.nextInt();
                System.out.print("Digite o segundo número: ");
                segundoNumero = input.nextInt();
                multiplicador = primeiroNumero * segundoNumero;
                System.out.println("Resultado da multiplicação: " + multiplicador);
                break;
            case 3:

                System.out.print("\nDigite o primeiro número: ");
                primeiroNumero = input.nextInt();
                System.out.print("Digite o segundo número: ");
                segundoNumero = input.nextInt();

                if (primeiroNumero < segundoNumero) {
                    System.out.println("Impossível fazer a subtração");
                    break;
                }
                subtracao = primeiroNumero - segundoNumero;
                System.out.println("Resultado da subtração: " + subtracao);
                break;
            case 4:

                System.out.print("\nDigite o primeiro número: ");
                primeiroNumero = input.nextInt();
                System.out.print("Digite o segundo número: ");
                segundoNumero = input.nextInt();

                if (primeiroNumero < segundoNumero) {
                    System.out.println("Impossível fazer a divisão");
                    break;
                }
                divisao = primeiroNumero / segundoNumero;
                System.out.println("Resultado da divisão: " + divisao);
                break;
            default:
                System.out.println("Erro, digite uma opção valida");
                break;
        }
        input.close();

    }
}
