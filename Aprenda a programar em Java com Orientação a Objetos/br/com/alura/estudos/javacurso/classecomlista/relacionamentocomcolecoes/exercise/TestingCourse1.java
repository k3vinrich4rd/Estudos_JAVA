package br.com.alura.estudos.javacurso.classecomlista.relacionamentocomcolecoes.exercise;

public class TestingCourse1 {
    public static void main(String[] args) {

        Course course1 = new Course("Dominando as coleções do Java", "Paulo Silveira");
        course1.addClassroom(new Classroom("Trabalhando com ArrayList", 60));
        course1.addClassroom(new Classroom("Criando uma aula", 20));
        course1.addClassroom(new Classroom("Modelando com coleções", 22));
        System.out.println(course1);

    }
}