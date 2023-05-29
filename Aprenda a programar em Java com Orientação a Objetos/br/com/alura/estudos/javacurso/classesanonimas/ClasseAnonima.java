package br.com.alura.estudos.javacurso.classesanonimas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ClasseAnonima {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do código");
        palavras.add("caelum");

        //Classe anônima
        palavras.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}