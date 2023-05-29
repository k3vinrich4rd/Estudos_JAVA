package br.com.alura.estudos.javacurso.lambda.ordenacao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class OrdenandoUmaListaComPeloTamanhoLambda3 {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do código");
        palavras.add("caelum");

        //Forma menos enxuta de se fazer
        Function<String, Integer> function = s -> s.length();
        Comparator<String> comparator = Comparator.comparing(function);
        palavras.sort(comparator);
    }
}
