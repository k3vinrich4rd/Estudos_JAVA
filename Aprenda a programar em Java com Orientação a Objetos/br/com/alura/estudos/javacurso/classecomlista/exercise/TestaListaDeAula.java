package br.com.alura.estudos.javacurso.classecomlista.exercise;

import java.util.ArrayList;
import java.util.Comparator;

import static java.util.Comparator.comparingInt;

public class TestaListaDeAula {
    public static void main(String[] args) {

        Aula aula1 = new Aula("Revistando as ArrayLists", 21);
        Aula aula2 = new Aula("Listas de objetos", 20);
        Aula aula3 = new Aula("Relacionamento de listas e objetos", 15);

        //Criando uma lista de objetos:
        ArrayList<Aula> listaDeAulas = new ArrayList<>();
        listaDeAulas.add(aula1);
        listaDeAulas.add(aula2);
        listaDeAulas.add(aula3);

        //toString sobrescrito:
        System.out.println(listaDeAulas + "\n");

        //ordenando com method reference (title)
        listaDeAulas.sort(Comparator.comparing(Aula::getTitle));
        System.out.println(listaDeAulas + "\n");

        //ordenando com method reference (timeInMinutes)
        //utilizando método estático:
        listaDeAulas.sort(comparingInt(Aula::getTimeInMinutes));
        listaDeAulas.forEach(System.out::println); //imprimindo utilizando method reference e forEach


    }
}
