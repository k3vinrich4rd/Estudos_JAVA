package br.com.alura.estudos.javacurso.classecomlista.exercise.ordenacao;

import br.com.alura.collections.classecomlista.relacionamentocomcolecoes.exercise.Classroom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestingClassListOrdenacaoFormasNaoEnxutas {
    public static void main(String[] args) {

        Classroom firstClass = new Classroom("Revisitando as ArrayLists", 21);
        Classroom secondClass = new Classroom("Listas de objetos", 20);
        Classroom thirdClass = new Classroom("Relacionamento de listas de objetos", 15);


        ArrayList<Classroom> classroomArrayList = new ArrayList<>();
        classroomArrayList.add(firstClass);
        classroomArrayList.add(secondClass);
        classroomArrayList.add(thirdClass);


        Collections.sort(classroomArrayList);
        System.out.println(classroomArrayList);

        Collections.sort(classroomArrayList, Comparator.comparing(Classroom::getTimeInMinutes));
        System.out.println(classroomArrayList);

        //forma mais enxuta de ser fazer ordenação:
        //classroomArrayList.sort(Comparator.comparing(Classroom::getTile));
        //System.out.println(classroomArrayList);

    }
}