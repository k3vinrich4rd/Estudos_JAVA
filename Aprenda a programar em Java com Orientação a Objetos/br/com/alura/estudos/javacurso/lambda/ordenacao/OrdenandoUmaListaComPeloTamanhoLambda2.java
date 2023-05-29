package br.com.alura.estudos.javacurso.lambda.ordenacao;

import java.util.ArrayList;
import java.util.List;

public class OrdenandoUmaListaComPeloTamanhoLambda2 {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do código");
        palavras.add("caelum");

        palavras.sort((string1, string2) -> Integer.compare(string1.length(), string2.length()));
        System.out.println(palavras);
    }
}