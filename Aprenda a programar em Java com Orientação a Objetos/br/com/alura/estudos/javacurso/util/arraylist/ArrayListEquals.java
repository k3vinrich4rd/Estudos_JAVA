package br.com.alura.estudos.javacurso.util.arraylist;

import br.com.alura.estudos.javacurso.poo.bytebank.template.Account;
import br.com.alura.estudos.javacurso.poo.bytebank.template.CurrentAccount;

import java.util.ArrayList;

public class ArrayListEquals {
    public static void main(String[] args) {
        //
//        ContaCorrente contaCorrente1 = new ContaCorrente(222, 222);
//        ContaCorrente contaCorrente2 = new ContaCorrente(222, 222);
//
//        boolean igualdade = contaCorrente1.ehIgual(contaCorrente2);
//        System.out.println("Essas contas são iguais: " + igualdade);


        // <> Generics
        //No caso a classe ArrayList é genérica, mas quando vai utiliza-lá
        //É possível tipifica-la
        ArrayList<Account> list = new ArrayList<>();

        CurrentAccount contaCorrente1 = new CurrentAccount(111, 111);
        list.add(contaCorrente1);

        CurrentAccount contaCorrente2 = new CurrentAccount(222, 222);
        list.add(contaCorrente2);


        CurrentAccount contaCorrente3 = new CurrentAccount(222, 222);
        boolean exists = list.contains(contaCorrente3);

        System.out.println("Já existe? " + exists);

        System.out.println("For");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("ForEach");
        for (Account conta : list) {
            System.out.println(conta);
        }

    }
}

