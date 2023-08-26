package br.com.alura.estudos.javacurso.classecomlista.relacionamentocomcolecoes.exercise;


import br.com.alura.estudos.javacurso.set.exercise.classecomconjuntosset.Student;

import java.util.Iterator;
import java.util.Set;

public class TestingCourseWithStudent2Iterator {
    public static void main(String[] args) {

        Course course1 = new Course("Dominando as coleções do Java", "Paulo Silveira");
        course1.addClassroom(new Classroom("Trabalhando com ArrayList", 60));
        course1.addClassroom(new Classroom("Criando uma aula", 20));
        course1.addClassroom(new Classroom("Modelando com coleções", 22));
        System.out.println(course1);

        Student student1 = new Student("Rodrigo Turini", 34672);
        Student student2 = new Student("Guilherme Silveira", 5617);
        Student student3 = new Student("Mauricio Aniche", 17645);

        course1.addStudent(student1);
        course1.addStudent(student2);
        course1.addStudent(student3);

        //Percorrendo sobre a lista de alunos matriculados com Iterator (forma legada)
        Set<Student> students = course1.getStudents();
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student);
        }


    }
}