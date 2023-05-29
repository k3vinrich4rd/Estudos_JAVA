package br.com.alura.estudos.javacurso.java8.apidatas.exercise;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class FormatandoAsDatas {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2009, Month.JANUARY, 25);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
        System.out.println(localDate.format(dateTimeFormatter));
        
    }
}