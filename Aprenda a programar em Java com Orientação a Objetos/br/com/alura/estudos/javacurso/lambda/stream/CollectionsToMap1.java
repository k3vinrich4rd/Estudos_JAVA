package br.com.alura.estudos.javacurso.lambda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionsToMap1 {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        Map<String, Integer> cursoStream = cursos.stream()

                .filter(curso -> curso.getAlunos() >= 100)
                .collect(Collectors.toMap(
                        curso -> curso.getNome(),
                        curso -> curso.getAlunos()));

        System.out.println(cursoStream);

    }
}
