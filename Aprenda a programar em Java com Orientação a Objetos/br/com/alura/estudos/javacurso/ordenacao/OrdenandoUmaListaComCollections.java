package br.com.alura.estudos.javacurso.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenandoUmaListaComCollections {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do código");
        palavras.add("caelum");

        Collections.sort(palavras);
        System.out.println(palavras);
    }
}