package br.com.alura.estudos.javacurso.lambda.stream;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteListaDeCursosOrdenacao {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        //Limitado a somente uma ação
        cursos.sort(Comparator.comparing(Curso::getAlunos));
        cursos.forEach(curso -> System.out.println(curso.getNome()));


    }
}