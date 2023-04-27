package br.com.alura.estudos.javacurso.util.arraylist;

import br.com.alura.estudos.javacurso.poo.bytebank.template.Account;
import br.com.alura.estudos.javacurso.poo.bytebank.template.CurrentAccount;

import java.util.ArrayList;

public class ArrayListComTipoDefinido {
    public static void main(String[] args) {

        // <> Generics
        //No caso a classe ArrayList é genérica, mas quando vai utiliza-lá
        //É possível tipifica-la

        ArrayList<Account> accounts = new ArrayList<>();

        CurrentAccount currentAccount = new CurrentAccount(111, 222);
        accounts.add(currentAccount);

        CurrentAccount contaCorrente2 = new CurrentAccount(222, 222);
        accounts.add(contaCorrente2);

        System.out.println("Tamanho da lista: " + accounts.size());
        Account referencia = accounts.get(0);
        System.out.println(referencia.getNumber());

        accounts.remove(0);

        System.out.println("Tamanho da lista: " + accounts.size());

        CurrentAccount contaCorrente3 = new CurrentAccount(333, 333);
        accounts.add(contaCorrente3);

        CurrentAccount contaCorrente4 = new CurrentAccount(444, 444);
        accounts.add(contaCorrente4);

        System.out.println();


        System.out.println("For");
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println(accounts.get(i));
        }

        System.out.println("--------------------------");

        System.out.println("ForEach");
        for (Account conta : accounts) {
            System.out.println(conta);
        }

        System.out.println("--------------------------");

        System.out.println("While");
        int i = 0;
        while (i < accounts.size()) {
            System.out.println(accounts.get(i));
            i++;
        }
    }

}
