package br.com.alura.estudos.javacurso.classecomlista.relacionamentocomcolecoes.exercise;

public class Classroom implements Comparable<Classroom>{
    private String tile;
    private int timeInMinutes;

    public Classroom() {

    }

    public Classroom(String tile, int timeInMinutes) {
        this.tile = tile;
        this.timeInMinutes = timeInMinutes;
    }

    public String getTile() {
        return this.tile;

    }

    public int getTimeInMinutes() {
        return this.timeInMinutes;
    }

    @Override
    public String toString() {
        return "[Aula: " + this.tile + ", " + this.timeInMinutes + " minutos";
    }

    @Override //Forma um pouco ultrapassada de se fazer uma ordenação
    public int compareTo(Classroom classroomOutside) {
        return this.tile.compareTo(classroomOutside.getTile());
    }
}