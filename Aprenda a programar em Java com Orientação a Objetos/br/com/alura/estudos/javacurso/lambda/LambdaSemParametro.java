package br.com.alura.estudos.javacurso.lambda;

public class LambdaSemParametro {
    public static void main(String[] args) {

        Runnable runnable = () -> System.out.println("Hello World");
        new Thread(runnable).start();
    }
}