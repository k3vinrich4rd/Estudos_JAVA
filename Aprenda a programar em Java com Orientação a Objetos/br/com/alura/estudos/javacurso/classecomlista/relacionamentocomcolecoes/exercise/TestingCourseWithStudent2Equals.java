package br.com.alura.estudos.javacurso.classecomlista.relacionamentocomcolecoes.exercise;

import br.com.alura.collections.set.exercise.classecomconjuntosset.Student;

public class TestingCourseWithStudent2Equals {
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

        //Percorrendo sobre a lista de alunos matriculados
        course1.getStudents().forEach(System.out::println);

        //Verificando se o aluno(a) está matriculado através do comportamento do objeto:
        Student turini = new Student("Rodrigo Turini", 34672);
        System.out.println("\nO Aluno está matriculado?");
        System.out.println(course1.isEnrolled(turini));

        System.out.println("O Student1 é igual a turini?");
        System.out.println(student1.equals(turini));


    }
}
