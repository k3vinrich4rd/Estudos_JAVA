package br.com.alura.estudos.javacurso.java8.apidatas.exercise.format;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormat {
    public static void main(String[] args) {
        LocalDateTime hoje = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        System.out.println(hoje.format(dateTimeFormatter));
    }
}