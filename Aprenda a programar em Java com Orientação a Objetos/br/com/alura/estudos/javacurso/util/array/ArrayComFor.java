package br.com.alura.estudos.javacurso.util.array;

public class ArrayComFor {
    public static void main(String[] args) {
        int[] ages = new int[3];

        for (int i = 0; i < ages.length; i++) {
            ages[i] = i * i;
            System.out.println(ages[i]);
        }
    }
}
