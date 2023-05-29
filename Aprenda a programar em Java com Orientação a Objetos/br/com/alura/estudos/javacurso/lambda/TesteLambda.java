package br.com.alura.estudos.javacurso.lambda;

import java.util.ArrayList;
import java.util.List;

public class TesteLambda {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do código");
        palavras.add("caelum");

        //Lambda
        palavras.forEach(palavra -> System.out.println(palavra));
    }
}