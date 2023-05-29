package br.com.alura.estudos.javacurso.lambda.stream.exercise;



import br.com.alura.estudos.javacurso.lambda.stream.Curso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ConvertendoParaMethodReference {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

/*
Antes de aplicar method reference:
cursos.stream()
   .filter(c -> c.getAlunos() > 50)
   .map(c -> c.getAlunos())
   .forEach(x -> System.out.println(x));C
 */


        cursos.sort(Comparator.comparingInt(Curso::getAlunos));
        //Depois de aplicar method reference:
        cursos.stream()
                .filter(curso -> curso.getAlunos() > 50)
                .mapToInt(Curso::getAlunos)
                .forEach(System.out::println);
    }
}