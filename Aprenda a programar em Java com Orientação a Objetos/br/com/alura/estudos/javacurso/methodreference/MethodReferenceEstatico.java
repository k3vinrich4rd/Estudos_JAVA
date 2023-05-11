package br.com.alura.estudos.javacurso.methodreference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceEstatico {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        //Sem method reference:
        list.stream().map((numbers) -> MethodReferenceEstatico.multipliquePorDois(numbers))
                .forEach((number) -> System.out.println(number));

        //Com method reference:
        list.stream()
                .map(MethodReferenceEstatico::multipliquePorDois)
                .forEach(System.out::println);
    }

    private static Integer multipliquePorDois(Integer i) {
        return i * 2;
    }
}