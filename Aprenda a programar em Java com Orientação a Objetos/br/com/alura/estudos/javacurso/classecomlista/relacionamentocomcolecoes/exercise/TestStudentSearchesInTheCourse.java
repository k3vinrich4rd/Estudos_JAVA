
package br.com.alura.estudos.javacurso.classecomlista.relacionamentocomcolecoes.exercise;

import br.com.alura.collections.set.exercise.classecomconjuntosset.Student;

public class TestStudentSearchesInTheCourse {
    public static void main(String[] args) {

        Course course1 = new Course("Dominando as coleções do Java", "Paulo Silveira");
        course1.addClassroom(new Classroom("Trabalhando com ArrayList", 60));
        course1.addClassroom(new Classroom("Criando uma aula", 20));
        course1.addClassroom(new Classroom("Modelando com coleções", 22));
        System.out.println(course1);

        Student student1 = new Student("Rodrigo Turini", 34672);
        Student student2 = new Student("Guilherme Silveira", 5617);
        Student student3 = new Student("Mauricio Aniche", 17645);
        Student student4 = new Student("Paulo Silveira", 5617);

        course1.addStudent(student1);
        course1.addStudent(student2);
        course1.addStudent(student3);
        course1.addStudent(student4);

        //Buscando um aluno matriculado através do número da sua matrícula:
        System.out.println("Quem é o aluno com a matricula 5617? ");
        Student student = course1.fetchStudentEnrolled(5617);
        System.out.println("Aluno: " + student);
    }
}