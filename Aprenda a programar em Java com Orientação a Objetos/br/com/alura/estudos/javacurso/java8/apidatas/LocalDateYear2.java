package br.com.alura.estudos.javacurso.java8.apidatas;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateYear2 {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();

        LocalDate olimpiadasRio = LocalDate.of(2025, Month.JUNE, 5);
        int anos = olimpiadasRio.getYear() - hoje.getYear();
        System.out.println("Faltam " + anos + " anos" + " para as olimpíadas");

        LocalDate proximaOlimpiadas = olimpiadasRio.plusYears(4);
        System.out.println(proximaOlimpiadas);
    }
    
}
