package br.com.alura.estudos.javacurso.lambda.stream;

import java.util.Arrays;
import java.util.List;

public class StreamComLambda {
    public static void main(String[] args) {
        List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5);
        asList.stream()
                .filter((value) -> value % 2 == 0)
                .forEach(System.out::println);
    }
}