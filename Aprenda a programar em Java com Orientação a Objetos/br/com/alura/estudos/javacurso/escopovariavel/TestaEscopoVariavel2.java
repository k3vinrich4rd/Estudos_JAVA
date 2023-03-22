package br.com.alura.estudos.javacurso.escopovariavel;

public class TestaEscopoVariavel2 {
    public static void main(String[] args) {


        //Forma de se declarar um variável dentro de um escopo condicional
        //Forma correta
        //Variáveis locais não tem valor default

        int age = 17;
        int quantidadeDePessoas = 4;
        boolean acompanhado;

        if (quantidadeDePessoas >= 2) {
            acompanhado = true;
        } else {
            acompanhado = false;
        }

        if (age >= 18 || acompanhado) {
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("Infelizmente você não pode entrar ");
        }
    }
}