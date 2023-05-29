package br.com.alura.estudos.javacurso.util.arraylist.exercise;

import java.util.ArrayList;

public class TestingList4Exception {
    public static void main(String[] args) {

        ArrayList<String> courses = new ArrayList<>();
        courses.add("Java OO: entendendo a Orientação a Objetos");
        courses.add("Java Polimorfismo: entenda herança e interfaces");
        courses.add("Java Exceções: aprenda a criar, lançar e controlar exceções");

        courses.forEach(System.out::println);
        courses.remove(1);

        for (int i = 0; i <= courses.size(); i++) {
            System.out.println(courses.get(i));
        }
    }
}