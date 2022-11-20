package comportamentodememoriaarrayslistas.listas.exemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Kevin Richard");
        list.add("Vilma Regiane");
        list.add("Carlos Eduardo");
        list.add("Ketelyn Mayara");
        list.add("Jhonatan Tavares");

        list.add(2, "Marli Candido");
        list.remove("Marli Candido");


        System.out.println(list.size());

        for (String names : list) {
            System.out.println(names);
        }
        System.out.println("------------------------------------------");
        list.removeIf(names -> names.charAt(0) == 'K');
        for (String names : list) {
            System.out.println(names);
        }
        System.out.println("------------------------------------------");
        System.out.println("Index of Vilma Regiane: " + list.indexOf("Vilma Regiane"));
        System.out.println("Index of Kevin Richard: " + list.indexOf("Kevin Richard"));
        System.out.println("------------------------------------------");
        List<String> result = list.stream().filter(names -> names.charAt(0) == 'V').collect(Collectors.toList());

        for (String names : result) {
            System.out.println(names);
        }
        System.out.println("------------------------------------------");
        String name = list.stream().filter(names -> names.charAt(0) == 'V').findFirst().orElse(null);
        System.out.println(name);



















        /*
        List<String> result = list.stream().filter(names -> names.charAt(0) == 'V').collect(Collectors.toList());
        Passo a passo acima:
        Converte para stream,
        faz a operação lambda e
         depois voltar para lista
         */

        /*
        stream: Aceita operações com expressões lambdas
         */


    }

}










/*

 */