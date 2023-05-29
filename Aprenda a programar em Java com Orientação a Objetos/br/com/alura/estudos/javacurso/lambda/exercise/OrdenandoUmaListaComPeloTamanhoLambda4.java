package br.com.alura.estudos.javacurso.lambda.exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
Modifique a forma que estamos fazendo o sort das palavras utilizando o Comparator.comparing().

O código atual está assim:

palavras.sort((s1, s2) -> {
    return Integer.compare(s1.length(), s2.length());
});
 */
public class OrdenandoUmaListaComPeloTamanhoLambda4 {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do código");
        palavras.add("caelum");

        //Forma menos enxuta de se fazer
        palavras.sort(Comparator.comparing(s -> s.length()));
    }
}