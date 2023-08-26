package br.com.alura.estudos.javacurso.classecomlista.relacionamentocomcolecoes.exercise;


import br.com.alura.estudos.javacurso.set.exercise.classecomconjuntosset.Student;

import java.util.*;

public class Course {

    private final String name;
    private final String instructor;
    private final List<Classroom> classrooms = new LinkedList<>();

    private final Set<Student> students = new HashSet<>();

    private final Map<Integer, Student> enrollmentForStudent = new HashMap<>();

    public Course(String name, String instructor) {
        this.name = name;
        this.instructor = instructor;
    }

    public void addClassroom(Classroom classrooms) {
        this.classrooms.add(classrooms);
    }

    public void addStudent(Student student) {
        this.students.add(student);
        this.enrollmentForStudent.put(student.getMatriculationNumber(), student);
    }

    public List<Classroom> getClassrooms() {
        //Devolve uma cópia da lista original, mas somente para leitura read-only
        return Collections.unmodifiableList(this.classrooms);
    }

    public Student fetchStudentEnrolled(int registrationNumber) {
        //Chave que o Mao recebe em seu parâmetro para associar ao valor
        if (!enrollmentForStudent.containsKey(registrationNumber)) {
            throw new NoSuchElementException();
        }
        return enrollmentForStudent.get(registrationNumber);
    }

    public boolean isEnrolled(Student student) {
        return this.students.contains(student);

    }

    public Set<Student> getStudents() {
        return Collections.unmodifiableSet(this.students);
    }

    public int getTotalTime() {
        return this.classrooms.stream().mapToInt(Classroom::getTimeInMinutes).sum();
    }

    public String getName() {
        return this.name;
    }

    public String getInstructor() {
        return this.instructor;
    }

    @Override
    public String toString() {
        return "[Curso: " + this.name + ", tempo total: " + this.getTotalTime() + " minutos"
                + "\nInstrutor: " + this.instructor
                + "\nAula ministradas: " + this.classrooms;
    }


}