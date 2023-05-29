package br.com.alura.estudos.javacurso.classecomlista.exercise.ordenacao;


import java.util.ArrayList;
import java.util.Comparator;

import static java.util.Comparator.comparingInt;

public class TestingClassListOrdenacaoFormasEnxutas {
    public static void main(String[] args) {

        Classroom firstClass = new Classroom("Revisitando as ArrayLists", 21);
        Classroom secondClass = new Classroom("Listas de objetos", 20);
        Classroom thirdClass = new Classroom("Relacionamento de listas de objetos", 15);

        ArrayList<Classroom> classroomArrayList = new ArrayList<>();
        classroomArrayList.add(firstClass);
        classroomArrayList.add(secondClass);
        classroomArrayList.add(thirdClass);

        //Fazendo ordenação de título com method reference
        classroomArrayList.sort(Comparator.comparing(Classroom::getTile));
        System.out.println(classroomArrayList);

        //Fazendo ordenação de tempo com um método estático e method reference:
        classroomArrayList.sort(comparingInt(Classroom::getTimeInMinutes));

    }
}