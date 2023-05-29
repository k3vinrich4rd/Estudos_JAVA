package br.com.alura.estudos.javacurso.methodreference.exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenandoUmaListaComMethodReference {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do código");
        palavras.add("caelum");

        palavras.sort(Comparator.comparingInt(String::length));
        System.out.println(palavras);
    }
}
