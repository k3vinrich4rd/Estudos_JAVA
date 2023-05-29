package br.com.alura.estudos.javacurso.classecomlista.relacionamentocomcolecoes.exercise.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ExercicioMap {

    public static void main(String[] args) {

        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");

        //Iterando com foreach (lambda):
        pessoas.keySet().forEach(age ->
                System.out.println(pessoas.get(age)));


        System.out.println();
        //Iterando com iterator:
        Iterator<Integer> iterator = pessoas.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(pessoas.get(iterator.next()));
        }


        System.out.println();
        //Iterando com foreach
        for (Integer age: pessoas.keySet()) {
            System.out.println(pessoas.get(age));
        }
    }


}