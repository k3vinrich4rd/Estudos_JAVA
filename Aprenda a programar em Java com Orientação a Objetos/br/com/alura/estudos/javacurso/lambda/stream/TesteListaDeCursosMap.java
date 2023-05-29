package br.com.alura.estudos.javacurso.lambda.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteListaDeCursosMap {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));


        //Ordenando também
        cursos.sort(Comparator.comparing(Curso::getAlunos));

        //Curiosidade, tudo que é feito no stream não impacta a coleção original
        //Stream tem um map. E um map devolve um stream
        cursos.stream().filter(curso -> curso.getAlunos() >= 100) //Filter recebe predicate
                .map(Curso::getAlunos)
                .forEach(System.out::println); //Filter tem outros métodos também


    }
}