package br.com.alura.estudos.javacurso.methodreference.ordenacao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenandoUmaListaComPeloTamanhoMethodReference {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do código");
        palavras.add("caelum");

        palavras.sort(Comparator.comparing(String::length));
        System.out.println(palavras);
    }
}