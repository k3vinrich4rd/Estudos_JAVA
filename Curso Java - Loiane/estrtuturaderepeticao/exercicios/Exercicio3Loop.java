package estrtuturaderepeticao.exercicios;

import java.util.Scanner;

public class Exercicio3Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean infomacaoValida = false;
        String nome;
        int idade;
        double salario;
        String genero;
        String estadoCivil;

        do {
            System.out.print("Informe seu nome: ");
            nome = input.next();
            if (nome.length() > 3) {
                infomacaoValida = true;

            } else {
                System.out.println(" O nome informado precisa de no minimo 3 caracteres");
            }
        } while (!infomacaoValida);

        infomacaoValida = false;

        do {
            System.out.print("Informe a sua idade: ");
            idade = input.nextInt();
            if (idade > 0 && idade < 150) {
                infomacaoValida = true;

            } else {
                System.out.println("Erro, a idade informada precisa ser entre 0 ou 150, digite novamente");
            }
        } while (!infomacaoValida);

        infomacaoValida = false;

        do {
            System.out.print("Informe o seu salário: ");
            salario = input.nextDouble();
            if (salario > 0) {
                infomacaoValida = true;
            } else {
                System.out.println("Erro, o salário informado tem que ser maior que zero, digite novamente");
            }
        } while (!infomacaoValida);

        infomacaoValida = false;

        do {
            System.out.print("Informe seu genero: ");
            genero = input.next();
            if (genero.equalsIgnoreCase("f") || genero.equalsIgnoreCase("m")) {
                infomacaoValida = true;
            } else {
                System.out.println("O sexo informado precisa ser 'Masculino' ou 'Feminino' ");

            }

        } while (!infomacaoValida);

        infomacaoValida = false;
        System.out.print("Informe o seu ");

    }
}
