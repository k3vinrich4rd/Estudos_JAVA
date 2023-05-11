package br.com.alura.estudos.javacurso.lambda;

import java.util.ArrayList;

public class Lambda1 {
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

        //Uma (função) lambda que itera uma lista e incrementa todas as listas
        valores.forEach(valor -> {
            System.out.println(valor);
            dobro.add(valor * 2);
            if (valor % 2 == 0) {
                par.add(valor);
            } else {
                impar.add(valor);

            }
        });

        System.out.println(dobro);
        System.out.println(par);
        System.out.println(impar);
    }
}