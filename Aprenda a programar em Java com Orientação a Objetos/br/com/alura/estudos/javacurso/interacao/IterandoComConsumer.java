package br.com.alura.estudos.javacurso.interacao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class IterandoComConsumer {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do código");
        palavras.add("caelum");

        Comparator<String> comparator = new ComparadorPorTamanho3();
        palavras.sort(comparator);

        Consumer<String> consumer = new PrintLine();
        palavras.forEach(consumer);

    }
}

class PrintLine implements Consumer<String> {

    @Override
    public void accept(String string) {
        System.out.println(string);
    }
}

class ComparadorPorTamanho3 implements Comparator<String> {

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