package br.com.alura.estudos.javacurso.lambda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsToList3 {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos = cursos.stream()
                .filter(curso -> curso.getAlunos() >= 100)
                .collect(Collectors.toList());

        cursos.forEach(curso -> System.out.println(curso.getNome()));

    }
}