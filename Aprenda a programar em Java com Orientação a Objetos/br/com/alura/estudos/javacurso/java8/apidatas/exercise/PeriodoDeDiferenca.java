package br.com.alura.estudos.javacurso.java8.apidatas.exercise;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodoDeDiferenca {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2009, Month.JANUARY, 25);
        System.out.println(localDate);

        LocalDate hoje = LocalDate.now();
        Period periodoDeDiferenca = Period.between(hoje, localDate);
        System.out.println(periodoDeDiferenca);
    }
}