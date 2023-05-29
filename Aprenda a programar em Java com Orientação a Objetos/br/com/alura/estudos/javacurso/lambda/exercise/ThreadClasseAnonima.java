package br.com.alura.estudos.javacurso.lambda.exercise;

public class ThreadClasseAnonima {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Executando um Runnable");
            }
        }).start();
    }


}