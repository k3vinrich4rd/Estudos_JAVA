package br.com.alura.estudos.javacurso.condicionais;

public class TestIfCondition2 {
    public static void main(String[] args) {
        System.out.println("Test condition:");

        int age = 17;
        int quantidadeDePessoas = 1;
        boolean acompanhado = quantidadeDePessoas >= 2; //valor boolean

        if (age >= 18) {
            System.out.println("Você pode entrar");
            System.out.println("Welcome");
        } else if (acompanhado) {
            System.out.println("Você pode entrar por ter um acompanhante");
            System.out.println("Welcome");
        } else {
            System.out.println("Infelizmente você não pode entrar ");
        }

    }
}