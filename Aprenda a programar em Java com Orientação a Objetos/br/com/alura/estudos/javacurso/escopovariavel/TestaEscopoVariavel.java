package br.com.alura.estudos.javacurso.escopovariavel;

public class TestaEscopoVariavel {
    public static void main(String[] args) {


        //Forma de se declarar um variável dentro de um escopo condicional
        //Não é muito acessível e utilizado
        //Variáveis locais não tem valor default

        int age = 17;
        int quantidadeDePessoas = 4;

        if (quantidadeDePessoas >= 2){
            boolean acompanhado = true;
        }else {
            boolean acompanhado = false;
        }
    }
}