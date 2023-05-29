package br.com.alura.estudos.javacurso.ordenacao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenandoUmaListaComComparator {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do código");
        palavras.add("caelum");

        Comparator<String> comparator = new ComparadorPorTamanho2();
        palavras.sort(comparator);
        System.out.println(palavras);
    }
}

class ComparadorPorTamanho2 implements Comparator<String> {

    @Override
    public int compare(String string1, String string2) {
        if (string1.length() < string2.length()) {
            return -1; //Para assumir a posição anterior
        } else if (string1.length() > string2.length()) {
            return 1;
        }
        return 0;
    }
}