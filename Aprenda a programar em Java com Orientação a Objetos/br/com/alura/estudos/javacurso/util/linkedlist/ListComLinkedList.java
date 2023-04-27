package br.com.alura.estudos.javacurso.util.linkedlist;

import br.com.alura.estudos.javacurso.poo.bytebank.template.Account;
import br.com.alura.estudos.javacurso.poo.bytebank.template.CurrentAccount;

import java.util.LinkedList;

public class ListComLinkedList {
    public static void main(String[] args) {

        LinkedList<Account> list = new LinkedList<>();

        CurrentAccount contaCorrente1 = new CurrentAccount(111, 111);
        list.add(contaCorrente1);

        CurrentAccount contaCorrente2 = new CurrentAccount(222, 222);
        list.add(contaCorrente2);

        int tamanhoDaLista = list.size();
        System.out.println("Tamanho da lista: " + tamanhoDaLista + "\n");
        System.out.println("For");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("-------------------------------------------------------");
        System.out.println("ForEach");
        for (Account conta : list) {
            System.out.println(conta);
        }

    }
}

