package br.com.alura.estudos.javacurso.condicionais.exercise;

import java.util.Scanner;

public class JogoDeFutebolTempo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tempo de duração do jogo: ");
        System.out.print("Horário inicial: ");
        int horarioInicial = input.nextInt();
        System.out.print("Horário final: ");
        int horarioFinal = input.nextInt();
        int duracao;

        if (horarioInicial < horarioFinal) {
            duracao = horarioFinal - horarioInicial;
        } else {
            duracao = 24 - horarioInicial + horarioFinal;
        }
        System.out.println("THE GAME DURATION " + duracao + " HOUR(S)");

        input.close();


    }
}