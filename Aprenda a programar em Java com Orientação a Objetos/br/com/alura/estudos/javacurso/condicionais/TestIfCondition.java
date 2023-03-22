package br.com.alura.estudos.javacurso.condicionais;

public class TestIfCondition {
    public static void main(String[] args) {
        System.out.println("Test condition:");

        int age = 16;
        int quantidadeDePessoas = 3;

        //Se for apenas uma estrutura condicional, não é necessário as chaves
        if (age >= 18) {
            System.out.println("Você tem mais de 18 anos");
            System.out.println("Welcome");
        } else if (quantidadeDePessoas >= 2) {
            System.out.println("Você não tem de 18 mas pode entrar, pois está acompanhado");
        } else {
            System.out.println("Infelizmente você não pode entrar");
        }
    }
}