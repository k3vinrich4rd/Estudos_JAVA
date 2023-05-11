package br.com.alura.estudos.javacurso.methodreference;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class MethodReferenceComUmaUnicaInstancia {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        //Sem method reference:
        BigDecimal dois = new BigDecimal(2);
        list.stream()
                .map((bigDecimal) -> new BigDecimal(bigDecimal))//conversão de Integer para bigDecimal
                .map(bigDecimal -> bigDecimal.multiply(dois))//Transformando o valor que agora é bigDecimal multiplicando
                .forEach(bigDecimal -> System.out.println(bigDecimal));
        System.out.println();


        //Com method reference:
        list.stream()
                .map(BigDecimal::new)
                .map(dois::multiply)
                .forEach(System.out::println);
    }

    private static Integer multipliquePorDois(Integer i) {
        return i * 2;
    }
}