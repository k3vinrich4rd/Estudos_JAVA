package br.com.alura.estudos.javacurso.lambda.exercise;

public class ThreadComLambda {
    public static void main(String[] args) {

        new Thread(() -> System.out.println("casa")).start();
    }
}