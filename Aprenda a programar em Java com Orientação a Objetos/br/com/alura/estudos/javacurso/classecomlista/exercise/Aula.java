package br.com.alura.estudos.javacurso.classecomlista.exercise;

public class Aula {

    private String title;
    private int timeInMinutes;

    public Aula(String title, int timeInMinutes) {
        this.title = title;
        this.timeInMinutes = timeInMinutes;
    }

    public String getTitle() {
        return this.title;
    }

    public int getTimeInMinutes() {
        return timeInMinutes;
    }

    @Override
    public String toString() {
        return "Aula: " + this.title + ", " + this.timeInMinutes + " minutes";
    }
}