package br.com.alura.estudos.javacurso.methodreference;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class MethodReferenceConstrutores {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        //Sem method reference:
        list.stream()
                .map((numbers) -> new BigDecimal(numbers))
                .forEach((number) -> System.out.println(number));
        System.out.println();


        //Com method reference:
        list.stream().
                map(BigDecimal::new)
                .forEach(System.out::println);
    }

    private static Integer multipliquePorDois(Integer i) {
        return i * 2;
    }
}