package br.com.alura.estudos.javacurso.lacosrepeticao.exercise.fori;

import java.util.Scanner;

/*
Leia um valor inteiro N. este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão no intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out." para fora do intervalo).
 */
public class IntervaloImpares {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um valor para saber se está no intervalo entre 10 e 20: ");
        int value = input.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < value; i++) {
            System.out.print("Digite o " + (i + 1) + "° valor: ");
            int x = input.nextInt();
            if (x >= 10 && x <= 20) {
                in += 1;
            } else {
                out += 1;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");

    }
}