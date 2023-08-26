package br.com.alura.estudos.javacurso.lacosrepeticao.exercise.whilee;

public class TestaWhile {
    public static void main(String[] args) {
        int count = 0;
        int total = 0;
        while (count <= 10){
            total += count;
            count++;
        }
        System.out.println(total);

    }
}