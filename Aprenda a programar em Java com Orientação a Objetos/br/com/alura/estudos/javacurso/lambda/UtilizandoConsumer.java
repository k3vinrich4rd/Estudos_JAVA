package br.com.alura.estudos.javacurso.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class UtilizandoConsumer {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        ArrayList<Integer> doubleValues = new ArrayList<>();
        ArrayList<Integer> pair = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        values.add(6);

        /* Iterando sobre a lista de values
        e retornando uma nova lista com os valores*/
        values.forEach(System.out::println);
        System.out.println();


        /* Dobrando os valores numéricos e iterando sobre a lista
        e retornando uma nova com os valores numéricos dobrados */
        Consumer<Integer> doubleNumbers = (value) -> {
            doubleValues.add(value * 2);
        };
        values.forEach(doubleNumbers);
        System.out.println(doubleValues);


        /* Pegando somente os valores impares e iterando sobre a lista
        retornado uma nova com os números impares */
        Consumer<Integer> numberOdd = (value) -> {
            if (value % 2 != 0) {
                odd.add(value);
            }
        };
        values.forEach(numberOdd);
        System.out.println(odd);


        /* Pegando somente os valores impares e iterando sobre a lista
        retornado uma nova com os números impares */
        Consumer<Integer> numberPair = (value) -> {
            if (value % 2 == 0) {
                pair.add(value);
            }
        };
        values.forEach(numberPair);
        System.out.println(pair);

    }
}