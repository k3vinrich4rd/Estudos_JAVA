package br.com.alura.estudos.javacurso.classecomlista.relacionamentocomcolecoes.exercise.map;

import java.util.*;

public class TesteMap {

    public static void main(String[] args) {

        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);


        //Iterando com lambda forEach lambda
        nomesParaIdade.forEach((s, integer) ->
                System.out.println("Chave: " + s + " value: " + integer));


        System.out.println();

        //Iterando com forEach:
        for (String nome : nomesParaIdade.keySet()) {
            System.out.println("Chave:" + nome);
        }

        System.out.println("--------");

        for (Integer idade : nomesParaIdade.values()) {
            System.out.println("Value: " + idade);
        }

        System.out.println();
        //Iterando com Entry:
        for (Map.Entry<String, Integer> a : nomesParaIdade.entrySet()) {
            System.out.println("Chave " + a.getKey() + " value: " + a.getValue());
        }
    }

}