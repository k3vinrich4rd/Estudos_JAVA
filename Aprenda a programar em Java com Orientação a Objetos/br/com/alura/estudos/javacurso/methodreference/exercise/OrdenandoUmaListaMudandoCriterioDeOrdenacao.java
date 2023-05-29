package br.com.alura.estudos.javacurso.methodreference.exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenandoUmaListaMudandoCriterioDeOrdenacao {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("Editora casa do código");
        palavras.add("caelum");

        //ele coloca em ordem alfabética, independentemente se a primeira letra é maiúscula ou minuscula
        //Um Comparator que ordena (objetos) String como compareToIgnoreCase.
        palavras.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(palavras);
    }
}