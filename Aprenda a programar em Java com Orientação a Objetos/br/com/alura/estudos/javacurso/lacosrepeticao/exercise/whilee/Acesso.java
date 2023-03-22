package br.com.alura.estudos.javacurso.lacosrepeticao.exercise.whilee;

import java.util.Scanner;
/*
Escreva um programa que repita a leitura de uma senha até ela ser válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
 */
public class Acesso {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the correct password to access the system: ");
        int password = input.nextInt();

        while (password != 2002) {
            System.out.println("Invalid password, type again");
            password = input.nextInt();
        }
        System.out.println("Allowed access");
        input.close();
    }
}