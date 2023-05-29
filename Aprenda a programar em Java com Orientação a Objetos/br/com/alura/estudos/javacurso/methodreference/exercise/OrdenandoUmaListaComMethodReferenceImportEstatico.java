package br.com.alura.estudos.javacurso.methodreference.exercise;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparingInt;

public class OrdenandoUmaListaComMethodReferenceImportEstatico {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do código");
        palavras.add("caelum");

        palavras.sort(comparingInt(String::length));
        System.out.println(palavras);
    }
}