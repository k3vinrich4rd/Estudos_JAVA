package br.com.alura.estudos.javacurso.util.listacomarrayevector;

import br.com.alura.estudos.javacurso.poo.bytebank.template.Account;
import br.com.alura.estudos.javacurso.poo.bytebank.template.CurrentAccount;

import java.util.ArrayList;
import java.util.List;

public class ListComArrayList {
    public static void main(String[] args) {
        List<Account> list = new ArrayList<>();

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

