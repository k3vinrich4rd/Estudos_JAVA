package br.com.alura.estudos.javacurso.classecomlista.relacionamentocomcolecoes.exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestingCourseOrdenacaoDeUnmodifiable {
    public static void main(String[] args) {

        Course course = new Course("Aprendendo os princípios de Java", "Graziella Ribeiro");
        course.addClassroom(new Classroom("Linguagem de programação Java", 120));
        course.addClassroom(new Classroom("Declarando variáveis em Java", 15));
        System.out.println(course);


        //Ordenando uma lista imutável
        List<Classroom> immutableClassroom = course.getClassrooms();
        System.out.println(immutableClassroom);

        //Fazendo uma lista mutável com base na imutável e ordenando
        List<Classroom> mutableClassroom = new ArrayList<>(immutableClassroom);
        mutableClassroom.sort(Comparator.comparing(Classroom::getTile));
        System.out.println(mutableClassroom);

        final String casa = "casa";
        System.out.println(casa);


        System.out.println(course.getTotalTime());
    }
}