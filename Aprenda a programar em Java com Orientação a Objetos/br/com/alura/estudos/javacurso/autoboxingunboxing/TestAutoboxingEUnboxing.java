package br.com.alura.estudos.javacurso.autoboxingunboxing;

import java.util.ArrayList;
import java.util.List;

public class TestAutoboxingEUnboxing {
    public static void main(String[] args) {
/*
Importante ? Só existem listas de referências (Objetos)
Só existem coleções de referências.
Curiosidade -> Para cada primitivo no mundo Java, existe algo que represente
esse tipo primitivo no mundo OO (Classes Wrapers*/

        int[] ages = new int[5];
        String[] names = new String[5];

        int idades = 29; //Integer — Tipo referência de int
        Integer idadeReferencia = new Integer(idades);   //por debaixo dos panos está acontecendo uma especie de type cast
        List<Integer> numbers = new ArrayList<>();
        numbers.add(29); //Má prática, pois uma coleção não aceita tipo primitivos
        
    }
}
