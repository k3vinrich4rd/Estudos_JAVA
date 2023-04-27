package br.com.alura.estudos.javacurso.wrapper;

public class MetodosInteger {
    public static void main(String[] args) {

        Integer idadeRef = Integer.valueOf(29); //AutoBoxing
        int valor = idadeRef.intValue(); //unboxing
        System.out.println(valor);

        //Parse ? transformação de String para um tipo mais específico

        /* O Parse representa uma análise sintática de uma quantidade
         de símbolos em alguma linguagem. No caso do Java,
        ele interpreta uma string ou conjunto de caracteres,
        fazendo com que o conteúdo dentro dela seja lido e interpretado
        corretamente no nosso

        Exemplo: */
        String s = args[0];
        Integer number = Integer.valueOf(s); //unboxing
        System.out.println(number);

        //Outra forma de se fazer sem ter um objeto de Integer
        String numberString = "10";
        int numberInt = Integer.parseInt(numberString);
        System.out.println(numberInt);

        //Transformando Integer em um tipo primitivo
        Integer numberWrapper = 12;
        System.out.println(numberWrapper.doubleValue());


        System.out.println("Constantes:");

    }
}