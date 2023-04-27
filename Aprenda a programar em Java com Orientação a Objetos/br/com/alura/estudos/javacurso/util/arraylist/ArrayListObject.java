package br.com.alura.estudos.javacurso.util.arraylist;

import br.com.alura.estudos.javacurso.poo.bytebank.template.Account;
import br.com.alura.estudos.javacurso.poo.bytebank.template.CurrentAccount;

import java.util.ArrayList;

public class ArrayListObject {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        CurrentAccount contaCorrente1 = new CurrentAccount(111, 111);
        list.add(contaCorrente1);

        CurrentAccount contaCorrente2 = new CurrentAccount(222, 222);
        list.add(contaCorrente2);

        System.out.println("Tamanho da lista: " + list.size());
        Account referencia = (Account) list.get(0);
        System.out.println(referencia.getNumber());

        list.remove(0);

        System.out.println("Tamanho da lista: " + list.size());

        CurrentAccount contaCorrente3 = new CurrentAccount(333, 333);
        list.add(contaCorrente3);

        CurrentAccount contaCorrente4 = new CurrentAccount(444, 444);
        list.add(contaCorrente4);

        System.out.println();


        System.out.println("For");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("--------------------------");

        System.out.println("ForEach");
        for (Object elemento : list) {
            System.out.println(elemento);
        }

    }
}

