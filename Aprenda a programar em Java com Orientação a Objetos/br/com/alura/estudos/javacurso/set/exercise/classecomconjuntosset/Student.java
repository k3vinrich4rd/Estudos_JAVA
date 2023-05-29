package br.com.alura.estudos.javacurso.set.exercise.classecomconjuntosset;

public class Student {
    private final String name;
    private final int matriculationNumber;

    public Student(String name, int matriculationNumber) {

        if (name == null) {
            throw new NullPointerException("Name cannot be null");
        }
        this.name = name;
        this.matriculationNumber = matriculationNumber;
    }

    public String getName() {
        return this.name;

    }

    public int getMatriculationNumber() {
        return this.matriculationNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student studentReference = (Student) obj;

        if (matriculationNumber != studentReference.matriculationNumber) return false;
        return name.equals(studentReference.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + matriculationNumber;
        return result;
    }

    @Override
    public String toString() {
        return "[Aluno: " + this.name + ", matricula: " + this.matriculationNumber +"]";
    }
}


   /* Forma antiga de implementação:

    @Override
    public int hashCode() {
        //Evita comparações desnecessários de inicias e faz uma soma
        //com os caracteres formando um número gigante de referência
        //para efetuar uma busca, evitando uma colisão de espalhamento
        //Porque o equals vai procurar menos ainda
        return this.name.hashCode();

    }

    @Override
    public boolean equals(Object obj) {
        Student studentReference = (Student) obj;
        return this.name.equals(studentReference.name) &&
                this.matriculationNumber == studentReference.matriculationNumber;
    }

    */