package br.com.alura.estudos.javacurso.lambda;

import java.util.ArrayList;

public class Lambda3 {
    public static void main(String[] args) {

        ArrayList<Integer> valores = new ArrayList<>();
        ArrayList<Integer> dobro = new ArrayList<>();
        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> par2 = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();
        ArrayList<Integer> impar2 = new ArrayList<>();

        valores.add(1);
        valores.add(2);
        valores.add(3);
        valores.add(4);
        valores.add(5);
        valores.add(6);

        dobro.add(2);
        dobro.add(4);
        dobro.add(6);
        dobro.add(8);
        dobro.add(10);
        dobro.add(12);

        par.add(7);
        par.add(1);
        par.add(3);
        par.add(4);
        par.add(8);
        par.add(10);

        impar.add(10);
        impar.add(1);
        impar.add(2);
        impar.add(7);
        impar.add(9);
        impar.add(11);

        //Method reference
        valores.forEach(System.out::println);
        System.out.println();
        dobro.forEach(System.out::println);
        System.out.println();

        par.forEach((pair) -> {
            if (pair % 2 == 0) {
                par2.add(pair);
            }
        });
        System.out.println(par2);
        System.out.println();

        impar.forEach((odd) -> {
            if (odd % 2 != 0) {
                impar2.add(odd);
            }
        });
        System.out.println(impar2);
    }
}