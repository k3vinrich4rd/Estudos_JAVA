package br.com.alura.estudos.javacurso.java8.apidatas.exercise;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatandoAsDatasHorasEMinutos {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        System.out.println(localDateTime.format(dateTimeFormatter));
    }
}