package br.com.alura.estudos.javacurso.lacosrepeticao;

import java.util.Scanner;

public class TestLacosEncadeadosTabuada2While {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find its multiplication: ");
        int number = input.nextInt();
        int multiple;
        int count = 0;

        while (count <= 10) {
            multiple = count * number;
            System.out.println(count + " x " + number + " = " + multiple);
            count++;
        }
    }
}