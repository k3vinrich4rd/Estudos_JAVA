package br.com.alura.estudos.javacurso.lambda;

import java.util.ArrayList;

public class UtilizandoConsumer2 {
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

        //As implementações abaixo é possível, pois o forEach Recebe um consumer

        /* Iterando sobre a lista de values
        e retornando uma nova lista com os valores
        */
        values.forEach(System.out::println);
        System.out.println();


        /* Dobrando os valores numéricos e iterando sobre a lista
        e retornando uma nova com os valores numéricos dobrados
        (Outra forma de se implementar)
        */
        values.forEach((value) -> {
            doubleValues.add(value * 2);
        });
        System.out.println(doubleValues);


        /* Pegando somente os valores impares e iterando sobre a lista
        retornado uma nova com os números impares
        (Outra forma de se implementar)
        */

        values.forEach((value) -> {
            if (value % 2 != 0) {
                odd.add(value);
            }
        });
        System.out.println(odd);


        /* Pegando somente os valores impares e iterando sobre a lista
        retornado uma nova com os números impares
        */
        values.forEach((value) -> {
            if (value % 2 == 0) {
                pair.add(value);
            }

        });

        System.out.println(pair);

    }
}