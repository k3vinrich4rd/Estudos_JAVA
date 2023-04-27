package br.com.alura.estudos.javacurso.util.array;

public class ArrayAges {
    public static void main(String[] args) {
        int[] ages = new int[5];

        ages[0] = 10;
        ages[1] = 17;
        ages[2] = 13;
        ages[3] = 31;
        ages[4] = 50;

        System.out.print("Interando com for");
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }

        System.out.println("Interando com while");
        int i = 0;
        while (i < ages.length) {
            System.out.println(ages[i]);
            i++;
        }

        System.out.println("Interando com forEach");
        for (int age: ages) {
            System.out.println(age);
        }
    }

}
