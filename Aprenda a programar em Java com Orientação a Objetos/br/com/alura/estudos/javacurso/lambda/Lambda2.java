package br.com.alura.estudos.javacurso.lambda;

import java.util.ArrayList;

public class Lambda2 {
    public static void main(String[] args) {

        ArrayList<Integer> valores = new ArrayList<>();
        ArrayList<Integer> dobro = new ArrayList<>();
        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();

        valores.add(1);
        valores.add(2);
        valores.add(3);
        valores.add(4);
        valores.add(5);
        valores.add(6);

        //Method reference
        valores.forEach(System.out::println);

        valores.forEach((Integer value) -> { //É opcional colocar o tipo
            dobro.add(value * 2);
        });

        valores.forEach((Integer value) -> { //É opcional colocar o tipo
            if (value % 2 == 0) {
                par.add(value);
            }
        });


        valores.forEach((Integer value) -> { //É opcional colocar o tipo
            if (value % 2 != 0) {
                impar.add(value);
            }
        });


        System.out.println(dobro);
        System.out.println(par);
        System.out.println(impar);
    }
}