package br.com.alura.estudos.javacurso.lacosrepeticao.exercise.fori;

public class Fatorial {
    public static void main(String[] args) {

        int fatorial = 1;
        for (int i = 1; i <= 10; i++) {
            fatorial *= i;
            System.out.println("O fatorial de " + i + " = " + fatorial);


        }

    }
}