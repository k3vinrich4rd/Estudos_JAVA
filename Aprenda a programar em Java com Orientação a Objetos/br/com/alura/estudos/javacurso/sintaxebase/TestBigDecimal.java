package br.com.alura.estudos.javacurso.sintaxebase;

import java.math.BigDecimal;

public class TestBigDecimal {
    public static void main(String[] args) {

        BigDecimal a = new BigDecimal("0.3");
        BigDecimal b = new BigDecimal("0.1");
        BigDecimal result = a.add(b);
        System.out.println(result);
    }
}