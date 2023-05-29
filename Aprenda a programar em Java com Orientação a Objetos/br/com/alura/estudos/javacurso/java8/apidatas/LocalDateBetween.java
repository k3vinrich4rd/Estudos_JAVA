package br.com.alura.estudos.javacurso.java8.apidatas;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class LocalDateBetween {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();

        LocalDate olimpiadasRio = LocalDate.of(2025, Month.JUNE, 5);
        int anos = olimpiadasRio.getYear() - hoje.getYear();

        Period period = Period.between(hoje, olimpiadasRio);
        System.out.println(period);

    }

}