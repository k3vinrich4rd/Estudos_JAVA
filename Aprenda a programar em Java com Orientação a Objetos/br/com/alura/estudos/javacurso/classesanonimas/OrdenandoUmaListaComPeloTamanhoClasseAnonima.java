package br.com.alura.estudos.javacurso.classesanonimas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class OrdenandoUmaListaComPeloTamanhoClasseAnonima {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do código");
        palavras.add("caelum");

        //Forma menos enxuta de se fazer classe anônima
        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        Comparator<String> comparator = Comparator.comparing(function);
        palavras.sort(comparator);
    }
}