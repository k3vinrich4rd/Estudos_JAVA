package br.com.alura.estudos.javacurso.lambda.stream.exercise;


import br.com.alura.estudos.javacurso.lambda.stream.Curso;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalEOrElse {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));


        //Depois de aplicar method reference:
        Optional<Curso> optionalCurso = cursos.stream()
                .filter(curso -> curso.getAlunos() >= 100)
                .findAny();

        Curso curso = optionalCurso.orElse(null);
        System.out.println(curso.getNome());

    }
}