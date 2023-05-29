package br.com.alura.estudos.javacurso.lambda.stream.exercise;

import br.com.alura.estudos.javacurso.lambda.stream.Curso;

import java.util.ArrayList;
import java.util.List;

public class OptionalManeiraEnxuta {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));


        //Depois de aplicar method reference:
        cursos.stream()
                .filter(curso -> curso.getAlunos() >= 1000) //devolve um stream
                .findAny()
                .ifPresent(curso -> System.out.println(curso.getNome()));

    }
}