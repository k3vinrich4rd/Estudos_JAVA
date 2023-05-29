package br.com.alura.estudos.javacurso.set;

import java.util.HashSet;
import java.util.Set;

public class TestingStudentsWithSet {
    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();

        alunos.add("Kevin Richard");
        alunos.add("Jose Fumi");
        alunos.add("Rafael");
        alunos.add("Luis");
        alunos.add("Pedro");

        alunos.forEach(System.out::println);
    }

}