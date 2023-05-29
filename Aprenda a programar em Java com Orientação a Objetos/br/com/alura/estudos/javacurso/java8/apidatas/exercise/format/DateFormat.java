package br.com.alura.estudos.javacurso.java8.apidatas.exercise.format;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateFormat {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();

        LocalDate olimpiadasRio = LocalDate.of(2025, Month.JUNE, 5);
        int anos = olimpiadasRio.getYear() - hoje.getYear();
        System.out.println("Faltam " + anos + " anos" + " para as olimpíadas");

        LocalDate proximaOlimpiadas = olimpiadasRio.plusYears(4);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("As próximas olimpíadas será em: "+ dateTimeFormatter.format(proximaOlimpiadas));

    }
}