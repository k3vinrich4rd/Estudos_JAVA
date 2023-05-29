package br.com.alura.estudos.javacurso.lambda.stream.exercise;


import br.com.alura.estudos.javacurso.lambda.stream.Curso;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Average {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        OptionalDouble optionalDouble = cursos.parallelStream()
                .mapToDouble(Curso::getAlunos)
                .average();

        System.out.println(optionalDouble);

    }
}