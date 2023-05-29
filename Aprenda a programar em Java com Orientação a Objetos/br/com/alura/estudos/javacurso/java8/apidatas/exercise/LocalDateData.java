package br.com.alura.estudos.javacurso.java8.apidatas.exercise;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateData {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2009, Month.JANUARY, 25);
        System.out.println(localDate);

    }
}