package br.com.alura.estudos.javacurso.methodreference.animes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

//Utilizando métodos não estáticos
public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Rimuru", "Veldira", "Hikimaru"));

        //Sem method reference:
        names.sort((names1, names2) -> names1.compareToIgnoreCase(names2));
        names.forEach((name) -> System.out.println(name));
        System.out.println();

        //Com method reference:
        names.sort(String::compareTo);
        System.out.println(names);

        //Trabalhando com conversões (Function) nos permite fazer isso
        //Sem method reference:
        Function<String, Integer> numberInStringToInteger = (s) -> Integer.parseInt(s);
        System.out.println(numberInStringToInteger.apply("10"));

        //Com method reference:
        Function<String, Integer> numberInStringToInteger2 = Integer::parseInt;
        System.out.println(numberInStringToInteger2.apply("15"));
        System.out.println();

        //Para verificar se tem um valor presente na lista
        //Com método reference:
        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(names, "Hikimaru"));

    }
}