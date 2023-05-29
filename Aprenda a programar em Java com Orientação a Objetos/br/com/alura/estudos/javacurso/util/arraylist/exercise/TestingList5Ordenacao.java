package br.com.alura.estudos.javacurso.util.arraylist.exercise;

import java.util.ArrayList;

public class TestingList5Ordenacao {
    public static void main(String[] args) {

        ArrayList<String> courses = new ArrayList<>();
        courses.add("Java OO: entendendo a Orientação a Objetos");
        courses.add("Java Polimorfismo: entenda herança e interfaces");
        courses.add("Java Exceções: aprenda a criar, lançar e controlar exceções");

        courses.sort(String::compareTo);
        courses.forEach(System.out::println);
    }
}