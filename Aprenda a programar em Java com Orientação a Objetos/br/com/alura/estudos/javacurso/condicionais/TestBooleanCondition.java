package br.com.alura.estudos.javacurso.condicionais;

public class TestBooleanCondition {
    public static void main(String[] args) {
        System.out.println("Test condition:");

        int age = 20;
        int quantidadeDePessoas = 3;
        //boolean acompanhado = true;
        //Outra forma de fazer a mesma coisa
        boolean acompanhado = quantidadeDePessoas >= 2;


        System.out.println("Valor de acompanhado " + acompanhado);
        //Se for apenas uma estrutura condicional, não é necessário as chaves
        if (age >= 18 && acompanhado) { //acompanhado == true Não necessita escrever assim porque o acompanhado já true
            System.out.println("Welcome");
        } else {
            System.out.println("Infelizmente você não pode entrar");
        }
    }
}